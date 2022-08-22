package model;

import lombok.Data;

@Data
public class PetModel {
    private long id;
    private String name;
    private Object[] photoUrls;
    private Object[] tags;
    private String status;
}
