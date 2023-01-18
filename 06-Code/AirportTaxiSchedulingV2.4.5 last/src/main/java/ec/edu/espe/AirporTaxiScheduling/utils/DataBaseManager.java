/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.AirporTaxiScheduling.utils;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public abstract class DataBaseManager {

    public abstract void create(Object object, MongoDatabase database, String collectionName);

    public abstract void read(MongoDatabase database);

    public abstract void update();

    public  abstract  void delete(MongoDatabase database, String collectionName, int idFinder);
    
    public abstract void loadFromDatabase();

}
