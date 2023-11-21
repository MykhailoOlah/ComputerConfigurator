package com.olah.practikArchitecture.dataLayer.optionalElements;

import com.olah.practikArchitecture.layerBusinessLogic.FeatureChecker;

public enum Speaker implements FeatureChecker { //динаміки
     Speaker("Sony SRS-XB23", "Sony", "red", 180),
     Yamaha_YAS("Yamaha YAS-109", "Yamaha", "black", 250),
     Marshall_Stockwell("Marshall Stockwell", "Marshall", "cream", 350),
     UE_Boom("UE Boom", "UE", "green", 200),
     Sonos_Move("Sonos Move", "Sonos", "white", 400);

     private String name;
     private String brand;
     private String color;
     private int cost;

     Speaker(String name, String brand, String color, int cost) {
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getBrand() {
          return brand;
     }

     public String getColor() {
          return color;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + color +
                  ", cost: " + cost + "$";
     }
}
