package pt.ipp.isep.dei.esoft.project.domain;

public class Land extends Property{
    private int id;
    private String propertyType;
    private String location;
    private double area;
    private double distanceCenter;
    private String photos;
    private Owner owner;

    public Land(String propertyType, String location, double area, double distanceCenter, String photos, Owner owner) {
        this.propertyType = propertyType;
        this.location = location;
        this.area = area;
        this.distanceCenter = distanceCenter;
        this.photos = photos;
        this.owner = owner;
    }

}