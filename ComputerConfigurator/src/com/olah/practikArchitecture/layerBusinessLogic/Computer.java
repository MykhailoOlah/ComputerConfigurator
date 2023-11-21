package com.olah.practikArchitecture.layerBusinessLogic;

public class Computer {
     private String keyBoard;
     private String mouse;
     private String monitor;
     private String lighting;
     private String speaker;
     private String CPU;
     private String graphicsCard;
     private String hardDrive;
     private String motherBoard;
     private String RAM;
     private String powerSupply;

     Computer(ComputerBuilder computerBuilder) {
          this.keyBoard = computerBuilder.getKeyBoard();
          this.mouse = computerBuilder.getMouse();
          this.monitor = computerBuilder.getMotinor();
          this.lighting = computerBuilder.getLighting();
          this.speaker = computerBuilder.getSpeaker();
          this.CPU = computerBuilder.getCPU();
          this.graphicsCard = computerBuilder.getGraphicsCard();
          this.hardDrive = computerBuilder.getHardDrive();
          this.motherBoard = computerBuilder.getMotherBoard();
          this.RAM = computerBuilder.getRAM();
          this.powerSupply = computerBuilder.getPowerSupply();
     }
     Computer() {
          throw new RuntimeException("Клас Computer має бути створений за допомогою білдера.");
     }

     @Override
     public String toString() {
          StringBuilder sb = new StringBuilder();
          sb.append("Computer Specifications:\n");
          sb.append(formatTableRow("CPU", CPU)).append("\n");
          sb.append(formatTableRow("Graphics Card", graphicsCard)).append("\n");
          sb.append(formatTableRow("Hard Drive", hardDrive)).append("\n");
          sb.append(formatTableRow("Motherboard", motherBoard)).append("\n");
          sb.append(formatTableRow("RAM", RAM)).append("\n");
          sb.append(formatTableRow("Power Supply", powerSupply)).append("\n");

          if (keyBoard != null) {
               sb.append(formatTableRow("Keyboard", keyBoard)).append("\n");
          }
          if (mouse != null) {
               sb.append(formatTableRow("Mouse", mouse)).append("\n");
          }
          if (monitor != null) {
               sb.append(formatTableRow("Monitor", monitor)).append("\n");
          }
          if (speaker != null) {
               sb.append(formatTableRow("Speaker", speaker)).append("\n");
          }
          if (lighting != null) {
               sb.append(formatTableRow("Lighting", lighting)).append("\n");
          }

          return sb.toString();
     }

     private String formatTableRow(String label, String value) {
          return String.format("%-15s: %s", label, value);
     }

}
