package model;

import lombok.Data;

@Data
public class GroceryModel {
    private int id;
    private String name;
    private double price;
    private int stock;
}
