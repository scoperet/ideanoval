package com.humanbooster.g5.ideanoval.jst.services;

import com.humanbooster.g5.ideanoval.jst.model.CategoryIdea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julie on 02/09/2016.
 */
public class CategoryService {
    private DatabaseService databaseService = null;
    /**
     * Attribut de connexion.
     */
    private Connection connection;

    /**
     * Paramètres des PreparedStatement
     */
    private final int FIRST_PARAMETER = 1;
    private final int SECOND_PARAMETER = 2;


    public CategoryService(Connection connection) {
        this.databaseService = new DatabaseService(connection);
        this.connection = connection;
    }

    /**
     * Permet de créer une catégorie. Donne le nombre d'entrées dans la table avant et après la création.
     * @param category à créer.
     * @return un booleen, true si catégorie créée, false si non créée.
     */
    public final boolean createCategory(final CategoryIdea category) {
        boolean isCreated = false;
        String query = "INSERT INTO category (label, description) VALUES (?,?);";
        PreparedStatement ps = null;
        try {
            System.out.println("Nombre d'entrées dans la table category avant la création : "
                    + databaseService.getNbEntriesOfTable("category_idea"));

            ps = connection.prepareStatement(query);
            ps.setString(FIRST_PARAMETER, category.getLabel());
            ps.setString(SECOND_PARAMETER, category.getDescription());
            ps.execute();
            isCreated = true;

            System.out.println("Nombre d'entrées dans la table category après la création : "
                    + databaseService.getNbEntriesOfTable("category_idea"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isCreated;
    }


    /**
     * Rechercher une catégorie grâce à son id.
     * @param id de la catégorie recherchée.
     * @return la catégorie trouvée.
     */
    public final CategoryIdea getCategoryById(final int id) {
        CategoryIdea categoryWanted = null;
        String query = "SELECT * FROM category_idea WHERE idCategory = ?;";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(FIRST_PARAMETER, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                categoryWanted = new CategoryIdea(rs.getString("label"), rs.getString("description"));
            } else if (categoryWanted == null) {
                System.out.println("Aucune catégorie correspondante !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryWanted;
    }

    /**
     * Récupérer un objet catégorie par son nom.
     * @param name nom de la catégorie recherchée.
     * @return la catégorie trouvée.
     */
    public final CategoryIdea getCategoryByName(final String name) {
        CategoryIdea categoryWanted = null;
        String query = "SELECT * FROM category WHERE nameCategory = ?";

        return categoryWanted;
    }

    /**
     * Supprimer une catégorie par son nom.
     * @param name nom de la catégorie à supprimer.
     * @return true si catégorie supprimée, false dans le cas inverse.
     */
    public final boolean deleteCategoryByName(final String name) {
        boolean isDeleted = false;
        String query = "DELETE FROM category WHERE label = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(FIRST_PARAMETER, name);
            ps.execute();
            isDeleted = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDeleted;
    }

    /**
     * Récupérer toutes les catégories de la base de données.
     * @return Une liste contenant toutes les catégories.
     */
    public final List<CategoryIdea> getCategoryList() {
        List<CategoryIdea> categoryList = null;
        String query = "SELECT * FROM category_idea";
        try {
            Statement stmt = connection.createStatement();
            categoryList = new ArrayList<>();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                do {
                    CategoryIdea category = new CategoryIdea(rs.getString("label"), rs.getString("description"));
                    categoryList.add(category);
                } while (rs.next());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }

}
