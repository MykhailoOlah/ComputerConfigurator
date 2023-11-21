package com.olah.practikArchitecture.dataLayer.optionalElements;

import com.olah.practikArchitecture.layerBusinessLogic.FeatureChecker;

public enum Mouse implements FeatureChecker { //мишка
     Mouse("Corsair Nightsword", "Corsair", "RGB", 100),
     Razer_Viper("Razer Viper", "Razer", "black", 70),
     SteelSeries_Aerox("SteelSeries Aerox", "SteelSeries", "white", 110),
     Logitech_G903("Logitech G903", "Logitech", "black", 120),
     ROCCAT_Kone("ROCCAT Kone", "ROCCAT", "black", 90);
     private String name;
     private String brand;
     private String color;
     private int cost;

     Mouse(String name, String brand, String color, int cost){
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
                  " | brand: " + brand +
                  " | color: " + color +
                  " | cost: " + cost + "$";
     }
}
