package com.olah.practikArchitecture.dataLayer.optionalElements;

import com.olah.practikArchitecture.layerBusinessLogic.FeatureChecker;

public enum Keyboard implements FeatureChecker { //клавіатура
     HyperX_Alloy_Elite ("HyperX Alloy Elite 2", "HyperX", "black", 150),
     Roccat_Vulcan ("Roccat Vulcan Pro", "Roccat", "white", 200),
     Logitech_G915 ("Logitech G915 Lightspeed", "Logitech", "black", 250),
     Ducky_One_2 ("Ducky One 2 Mini", "Ducky", "black", 120),
     Corsair_K70_RGB ("Corsair K70 RGB TKL", "Corsair", "black", 180);
     private String name;
     private String brand;
     private String color;
     private int cost;

     Keyboard(String name, String brand, String color, int cost){
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
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

     public String getName() {
          return name;
     }

     public String getAllFeatures(){
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + color +
                  ", cost: " + cost + "$";
     }
}