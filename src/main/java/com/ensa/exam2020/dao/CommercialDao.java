package com.ensa.exam2020.dao;

import com.ensa.exam2020.modele.Commercial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface CommercialDao {
    public List<Commercial> getAllCommercial() throws SQLException, ClassNotFoundException;

    public boolean deleteCommercial(int id);
}
