/**
 * User input of inventory name, price and weight.
 * Add it in the json array.
 * Edit the inventory to change weight and price.
 * Delete the inventory.
 * Print the json array in the console.
 * Calculate the total weight, total price and total value of the inventory stored.
 *
 * @author: SAYANI KOLEY
 * @since: 20.06.2021
 */

package InventoryController;

import InventoryService.InventoryService;
import InventoryService.InventoryServiceInterface;
import Util.UserInputOutput;
import org.json.JSONArray;
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
                    jsonArray = service.addItems(jsonArray);
                    flag = true;
                    break;
                case 2:
                    System.out.println("\n" + "Edit Inventory");
                    System.out.print("Enter the item name you want to edit: ");
                    String editedName = input.next();
                    service.editItems(jsonArray, editedName);
                    break;
                case 3:
                    System.out.println("\n" + "Delete Inventory");
                    System.out.print("Enter the item name you want to delete: ");
                    String deletedName = input.next();
                    service.removeItems(jsonArray, deletedName);
                    break;
                case 4:
                    System.out.print("\n" + "View Inventory" + "\n");
                    service.displayItems(jsonArray);
                    flag = true;
                    break;
                case 5:
                    System.out.println("\n" + "Total value of Inventory");
                    service.totalValueOfInventory(jsonArray);
                    break;
                case 6:
                    System.out.println("\n" + "Total weight of Inventory");
                    service.totalWeightOfInventory(jsonArray);
                    break;
                case 7:
                    System.out.println("\n" + "Total price of Inventory");
                    service.totalPriceOfInventory(jsonArray);
                    break;
                case 8:
                    flag = false;
                    break;
            }
        }
    }
}
