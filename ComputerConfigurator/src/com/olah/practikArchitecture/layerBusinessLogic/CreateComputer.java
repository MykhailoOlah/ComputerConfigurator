package com.olah.practikArchitecture.layerBusinessLogic;

import com.olah.practikArchitecture.dataLayer.optionalElements.*;
import com.olah.practikArchitecture.dataLayer.mandatoryElements.*;

import java.util.Scanner;

public class CreateComputer {
     public static int cost;
     public Computer computer;
     Scanner in = new Scanner(System.in);
     private CPU selectedCPU;
     private GraphicsCard selectedGraphicsCard;
     private HardDrive selectedHardDrive;
     private Motherboard selectedMotherboard;
     private RAM selectedRAM;
     private PowerSupply selectedPowerSupply;
     private Keyboard selectedKeyboard;
     private Mouse selectedMouse;
     private Monitor selectedMonitor;
     private Lighting selectedLighting;
     private Speaker selectedSpeaker;

     public void buildCoreComponents() {
          selectedCPU = chooseComponent(in, CPU.class, "Оберіть процесор:");
          selectedGraphicsCard = chooseComponent(in, GraphicsCard.class, "Оберіть відеокарту:");
          selectedHardDrive = chooseComponent(in, HardDrive.class, "Оберіть жорсткий диск:");
          selectedMotherboard = chooseComponent(in, Motherboard.class, "Оберіть материнську плату:");
          selectedRAM = chooseComponent(in, RAM.class, "Оберіть оперативну пам'ять:");
          selectedPowerSupply = chooseComponent(in, PowerSupply.class, "Оберіть блок живлення:");
     }

     public void buildKeyboard() {
          selectedKeyboard = chooseComponent(in, Keyboard.class, "Оберіть клавіатуру:");
     }

     public void buildMouse() {
          selectedMouse = chooseComponent(in, Mouse.class, "Оберіть мишу:");
     }

     public void buildMonitor() {
          selectedMonitor = chooseComponent(in, Monitor.class, "Оберіть монітор:");
     }

     public void buildLighting() {
          selectedLighting = chooseComponent(in, Lighting.class, "Оберіть освітлення:");
     }

     public void buildSpeaker() {
          selectedSpeaker = chooseComponent(in, Speaker.class, "Оберіть динамік:");
     }

     public Computer buildComputer() {
          if (selectedCPU == null || selectedGraphicsCard == null || selectedHardDrive == null || selectedMotherboard == null
                || selectedRAM == null || selectedPowerSupply == null) {
               throw new RuntimeException("Недостатньо обов'язкових компонентів для створення комп'ютера!");
          }

          ComputerBuilder computerBuilder = new ComputerBuilder()
                .setCPU(selectedCPU.getName())
                .setGraphicsCard(selectedGraphicsCard.getName())
                .setHardDrive(selectedHardDrive.getName())
                .setMotherBoard(selectedMotherboard.getName())
                .setRAM(selectedRAM.getName())
                .setPowerSupply(selectedPowerSupply.getName());

          if (selectedKeyboard != null) {
               computerBuilder.setKeyBoard(selectedKeyboard.getName());
          }

          if (selectedMouse != null) {
               computerBuilder.setMouse(selectedMouse.getName());
          }

          if (selectedMonitor != null) {
               computerBuilder.setMonitor(selectedMonitor.getName());
          }

          if (selectedSpeaker != null) {
               computerBuilder.setSpeaker(selectedSpeaker.getName());
          }

          if (selectedLighting != null) {
               computerBuilder.setLighting(selectedLighting.getName());
          }

          Computer computer = computerBuilder.build();
          System.out.println(computer.toString());

          return computer;
     }

     public static <T extends Enum<?> & FeatureChecker> T selectOption(Scanner in, Class<T> enumType, String prompt) {
          System.out.println(prompt);
          T[] options = enumType.getEnumConstants();

          for (int i = 0; i < options.length; i++) {
               System.out.println((i + 1) + ": " + options[i].getAllFeatures());
          }

          T selectedComponent = null;
          boolean validInput = false;

          while (!validInput) {
               try {
                    System.out.print("Ваш вибір: ");
                    int selectedIndex = in.nextInt();

                    if (selectedIndex >= 1 && selectedIndex <= options.length) {
                         selectedComponent = options[selectedIndex - 1];
                         validInput = true;
                    } else {
                         System.out.println("Недійсний вибір. Будь ласка, виберіть ще раз!");
                    }
               } catch (java.util.InputMismatchException e) {
                    System.out.println("Помилка: очікується ціле число. Будь ласка, введіть ще раз!");
                    in.next();
               }
          }
          return selectedComponent;
     }

     public static <T extends Enum<?> & FeatureChecker> T chooseComponent(Scanner in, Class<T> enumType, String message) {
          T selectedComponent = selectOption(in, enumType, message);
          if (selectedComponent != null) {
               cost += selectedComponent.getCost();
          }
          return selectedComponent;
     }
}
