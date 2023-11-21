package com.olah.practikArchitecture.dataLayer.optionalElements;

import com.olah.practikArchitecture.layerBusinessLogic.FeatureChecker;

public enum Lighting implements FeatureChecker { //підсвітка
     LightBulb("SmartX Light", "SmartX", "white", 100),
     AuroraPanels("Aurora Panels", "Aurora", "multicolor", 130),
     RadiantBulb("Radiant Bulb", "Radiant", "multicolor", 80),
     SmartLink("Smart Link", "SmartLink", "white", 60),
     ChromaStrips("Chroma Strips", "Chroma", "multicolor", 70);

     private String name;
     private String brand;
     private String color;
     private int cost;

     Lighting(String name, String brand, String color, int cost) {
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public Lighting setName(String name) {
          this.name = name;
          return this;
     }

     public String getBrand() {
          return brand;
     }

     public Lighting setBrand(String brand) {
          this.brand = brand;
          return this;
     }

     public String getColor() {
          return color;
     }

     public Lighting setColor(String color) {
          this.color = color;
          return this;
     }

     public int getCost() {
          return cost;
     }

     public Lighting setCost(int cost) {
          this.cost = cost;
          return this;
     }
     public String getAllFeatures(){
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + color +
                  ", cost: " + cost + "$";
     }
}
