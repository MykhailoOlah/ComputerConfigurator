package com.olah.practikArchitecture.interfaceLayer;

import com.olah.practikArchitecture.layerBusinessLogic.CreateComputer;

import java.util.Scanner;

import static com.olah.practikArchitecture.layerBusinessLogic.CreateComputer.cost;

public class InterfaceLayer {
     static int choice;
     Scanner in = new Scanner(System.in);
     CreateComputer createComputer = new CreateComputer();

     public void runner() {
          userChoice();
     }

     public void userChoice() {
          while (true) {
               System.out.println("computer configurator from Olag");
               System.out.println("Оберіть дію для подальшої роботи програми:");
               System.out.println("1) Основні компоненти");
               System.out.println("2) Опційні компоненти");
               System.out.println("3) Створити збірку");
               System.out.println("4) Вихід");
               System.out.print("Ваш вибір: ");

               choice = in.nextInt();
               switch (choice) {
                    case 1:
                         System.out.println("Основні компоненти:");
                         coreComponents();
                         break;
                    case 2:
                         System.out.println("Опційні компоненти:");
                         helperComponents();
                         break;
                    case 3:
                         System.out.println("Створення збірки:");
                         createComputer();
                         break;
                    case 4:
                         return;
               }
          }
     }

     public void coreComponents() {
          createComputer.buildCoreComponents();
     }

     public void helperComponents() {
          while (true) {
               System.out.println("1) Клавіатура");
               System.out.println("2) Миша");
               System.out.println("3) Монітор");
               System.out.println("4) Освітлення");
               System.out.println("5) Динамік");
               System.out.println("6) Повернутися до головного меню");

               System.out.print("Оберіть номер опційного компонента: ");
               int option = in.nextInt();

               if (option == 6) {
                    break;
               }

               switch (option) {
                    case 1:
                         createComputer.buildKeyboard();
                         break;
                    case 2:
                         createComputer.buildMouse();
                         break;
                    case 3:
                         createComputer.buildMonitor();
                         break;
                    case 4:
                         createComputer.buildLighting();
                         break;
                    case 5:
                         createComputer.buildSpeaker();
                         break;
                    default:
                         System.out.println("Недійсний вибір");
               }
          }
     }

     public void createComputer() {
          System.out.println("Ціна вашої кастомної збірки: $" + cost + "\nВибрані вами компоненти:");
          createComputer.buildComputer();
     }
}
