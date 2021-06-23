/**
 * JSON Inventory Data Management of Rice, Pulses and Wheats
 * Desc -> Create a JSON file having Inventory Details for Rice, Pulses and Wheats with properties name, weight, price per kg.
 * Use Library : Java JSON Library
 * I/P -> read in JSON File
 * Logic -> Get JSON Object in Java or NSDictionary in iOS. Create Inventory Object from JSON. Calculate the value for every Inventory.
 * O/P -> Create the JSON from Inventory Object and output the JSON String
 *
 * @author: SAYANI KOLEY
 * @since: 15.06.2021
 */

package InventoryController;

import InventoryService.InventoryService;
import InventoryService.InventoryServiceInterface;
import Util.UserInputOutput;
import org.json.simple.JSONArray;

import java.util.Scanner;

public class InventoryMain {
    static Scanner input = new Scanner(System.in);
    static InventoryServiceInterface service = new InventoryService();

    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        boolean flag = true;

        while (flag) {
            int choice = UserInputOutput.getUserChoice();
            switch (choice) {
                case 1:
                    System.out.println("\n" + "Add Inventory");
                    service.addItems(jsonArray);
                    flag = true;
                    break;
                case 2:
                    System.out.println("\n" + "Edit Inventory");
                    jsonArray = service.readFile();
                    System.out.print("Enter the item name you want to edit: ");
                    String editedName = input.next();
                    jsonArray = service.editItems(jsonArray, editedName);
                    service.writeFile(jsonArray);
                    break;
                case 3:
                    System.out.println("\n" + "Delete Inventory");
                    jsonArray = service.readFile();
                    System.out.print("Enter the item name you want to delete: ");
                    String deletedName = input.next();
                    jsonArray = service.removeItems(jsonArray, deletedName);
                    service.writeFile(jsonArray);
                    break;
                case 4:
                    System.out.print("\n" + "View Inventory" + "\n");
                    jsonArray = service.readFile();
                    service.displayItems(jsonArray);
                    flag = true;
                    break;
                case 5:
                    System.out.println("\n" + "Total value of Inventory");
                    jsonArray = service.readFile();
                    service.totalValueOfInventory(jsonArray);
                    break;
                case 6:
                    System.out.println("\n" + "Total weight of Inventory");
                    jsonArray = service.readFile();
                    service.totalWeightOfInventory(jsonArray);
                    break;
                case 7:
                    System.out.println("\n" + "Total price of Inventory");
                    jsonArray = service.readFile();
                    service.totalPriceOfInventory(jsonArray);
                    break;
                case 8:
                    flag = false;
                    break;
            }
        }
    }
}
