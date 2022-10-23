package com.nestdigital.carbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")


public class CarModel {

    @Id
    @GeneratedValue
    private int id;
    private String carname;
    private String carcolor;
    private String carbrand;
    private String cardescription;
    private int carprice;

    public CarModel() {
    }

    public CarModel(int id, String carname, String carcolor, String carbrand, String cardescription, int carprice) {
        this.id = id;
        this.carname = carname;
        this.carcolor = carcolor;
        this.carbrand = carbrand;
        this.cardescription = cardescription;
        this.carprice = carprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCardescription() {
        return cardescription;
    }

    public void setCardescription(String cardescription) {
        this.cardescription = cardescription;
    }

    public int getCarprice() {
        return carprice;
    }

    public void setCarprice(int carprice) {
        this.carprice = carprice;
    }
}
