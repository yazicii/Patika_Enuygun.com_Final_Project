package pom.model;

import lombok.Data;

@Data
public class Features {
    private String origin;
    private String destination;
    private int departureDate;
    private int returnDate;
    private String provider;
    private boolean isDirect;

    public Features() {
        this.origin = "İstanbul";
        this.destination = "Amsterdam";
        this.departureDate = 10;
        this.returnDate = 5;
        this.provider = "pegasus";
        this.isDirect = true;
    }

}
