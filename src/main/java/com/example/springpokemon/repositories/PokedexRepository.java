package com.example.springpokemon.repositories;

import com.example.springpokemon.models.Pokemon;
import com.example.springpokemon.utility.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PokedexRepository {
    private ConnectionManager conn = new ConnectionManager();

    //Mangler en forbindelse til databasen
    public List<Pokemon> getALlFirePokemon(){
        List<Pokemon> allFirePokemon = new ArrayList<>();

        Connection database = conn.getConnection();
        try{
            PreparedStatement preparedStatement = database.prepareStatement("SELECT * FROM pokemon WHERE primary_type = ?");
            preparedStatement.setString(1, "Fire");
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){

            }
        }
        catch(Exception e){
            System.out.println("Could not prepare statement");
        }
    }
}
