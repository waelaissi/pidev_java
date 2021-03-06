/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author chaker
 */
public class Chambre {
    
     private int id ;
    private String type ;
    private int id_hotel ;

    // constructeur par default
    public Chambre(){}

    // constructeur paramtere avec le champs id

    public Chambre(int id, String type, int id_hotel) {
        this.id = id;
        this.type = type;
        this.id_hotel = id_hotel;
    }

    // constructeur parametrer sans le champ id
    public Chambre( String type, int id_hotel) {

        this.type = type;
        this.id_hotel = id_hotel;
    }


    // getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    // toString methode


    @Override
    public String toString() {
        return "Chambre{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", id_hotel=" + id_hotel +
                '}';
    }
    
    
    
}
