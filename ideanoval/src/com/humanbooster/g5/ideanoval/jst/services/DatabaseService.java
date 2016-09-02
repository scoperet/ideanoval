package com.humanbooster.g5.ideanoval.jst.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Julie on 02/09/2016.
 */
public class DatabaseService {
    /**
     * Attribut de connexion.
     */
    private Connection connection;

    /**
     * Constructeur avec la connexion.
     * @param conn
     */
    public DatabaseService(Connection conn) {
        this.connection = conn;
    }

    public int getNbEntriesOfTable(String tableName) {
        int nbEntries = 0;
        String query = "SELECT COUNT(*) AS total FROM " + tableName;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                nbEntries = rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nbEntries;
    }
}
