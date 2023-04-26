/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Redmi
 */


public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private double cylinderCapacity;
    private double vehicleValue;
    private double tax;

    public Vehicle(String ownerName, String vehicleType, double cylinderCapacity, double vehicleValue) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.cylinderCapacity = cylinderCapacity;
        this.vehicleValue = vehicleValue;
        calculateTax();
    }
    
    private void calculateTax() {
        if (cylinderCapacity < 100) {
            tax = vehicleValue * 0.01;
        } else if (cylinderCapacity >= 100 && cylinderCapacity <= 200) {
            tax = vehicleValue * 0.03;
        } else {
            tax = vehicleValue * 0.05;
        }
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public String getVehicleType() {
        return vehicleType;
    }
    
    public double getCylinderCapacity() {
        return cylinderCapacity;
    }
    
    public double getVehicleValue() {
        return vehicleValue;
    }
    
    public double getTax() {
        return tax;
    }
    
    
}
