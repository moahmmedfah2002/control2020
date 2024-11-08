package com.ensa.exam2020.dao.impl;

import com.ensa.exam2020.Connexion;
import com.ensa.exam2020.dao.CommercialDao;
import com.ensa.exam2020.modele.Commercial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommercialImpl implements CommercialDao {

    private Connexion connexion;

    @Override
    public List<Commercial> getAllCommercial() throws SQLException, ClassNotFoundException {
        connexion=new Connexion();

        ResultSet resultSet=connexion.getSt().executeQuery("SELECT * FROM commercial ");
        List<Commercial> commercials=new ArrayList<>();
        while(resultSet.next()){
            Commercial commercial=new Commercial();
            commercial.setNom(resultSet.getString("nom"));
            commercial.setPrenom(resultSet.getString("prenom"));
            commercial.setMatricule(resultSet.getString("matricule"));
            commercials.add(commercial);

        }


        return commercials;
    }
    public static  void  main(String[] args) throws SQLException, ClassNotFoundException {
        CommercialImpl commercialImpl=new CommercialImpl();
        List<Commercial> commercials=commercialImpl.getAllCommercial();

        for(Commercial commercial:commercials){
            System.out.println(commercial.getNom());
        }
    }


    @Override
    public boolean deleteCommercial(int id) {
        return false;
    }
}
