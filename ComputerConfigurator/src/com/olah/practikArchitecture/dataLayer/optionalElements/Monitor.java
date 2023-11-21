package com.olah.practikArchitecture.dataLayer.optionalElements;

import com.olah.practikArchitecture.layerBusinessLogic.FeatureChecker;

public enum Monitor implements FeatureChecker { //монітор
     Monitor("Gigabyte AORUS", "Gigabyte", "27-inch", "2560x1440", 600),
     ViewSonic_Elite("ViewSonic Elite", "ViewSonic", "32-inch", "3840x2160", 750),
     Samsung_Odyssey("Samsung Odyssey", "Samsung", "34-inch", "3440x1440", 900),
     BenQ_ZOWIE("BenQ ZOWIE", "BenQ", "24-inch", "1920x1080", 300),
     MSI_Optix("MSI Optix", "MSI", "27-inch", "1920x1080", 400);

     private String name;
     private String brand;
     private String size;
     private String resolution;
     private int cost;

     Monitor(String name, String brand, String size, String resolution, int cost) {
          this.name = name;
          this.brand = brand;
          this.size = size;
          this.resolution = resolution;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getBrand() {
          return brand;
     }

     public String getSize() {
          return size;
     }

     public String getResolution() {
          return resolution;
     }

     public int getCost() {
          return cost;
     }
     public String getAllFeatures(){
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + size +
                  ", resolution: " + resolution +
                  ", cost: " + cost + "$";
     }
}
