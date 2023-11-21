package com.olah.practikArchitecture.dataLayer.mandatoryElements;

import com.olah.practikArchitecture.layerBusinessLogic.FeatureChecker;

public enum CPU implements FeatureChecker {
     INTEL("Intel", "Core i9-11900K", "3.5 GHz", 8, 16, 550),
     IBM_POWER("IBM Power", "POWER10", "4.0 GHz", 16, 32, 900),
     ARM("ARM", "Cortex-A78", "3.0 GHz", 8, 8, 250),
     NVIDIA_GRACE("NVIDIA Grace", "Grace CPU", "3.2 GHz", 32, 64, 1200),
     AMD("AMD", "Ryzen 9 5900X", "4.8 GHz", 12, 24, 480),
     APPLE_M2("Apple M2", "M2 Pro", "3.5 GHz", 10, 12, 700),
     QUALCOMM("Qualcomm", "Snapdragon 8cx Gen 3", "3.0 GHz", 8, 24, 350);

     private String name;
     private String model;
     private String clockSpeed;
     private int cores;
     private int threads;
     private int cost;

     CPU(String name, String model, String clockSpeed, int cores, int threads, int cost) {

          this.name = name;
          this.model = model;
          this.clockSpeed = clockSpeed;
          this.cores = cores;
          this.threads = threads;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getModel() {
          return model;
     }

     public String getClockSpeed() {
          return clockSpeed;
     }

     public int getCores() {
          return cores;
     }

     public int getThreads() {
          return threads;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Brand: " + name +
                  ", Model: " + model +
                  ", Clock Speed: " + clockSpeed +
                  ", Cores: " + cores +
                  ", Threads: " + threads +
                  ", Price: " + cost + "$";
     }
}
