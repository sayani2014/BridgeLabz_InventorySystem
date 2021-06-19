package InventoryService;

import DAO.InventoryDAO;
import org.json.JSONArray;
import java.util.Scanner;

public class InventoryService implements InventoryServiceInterface {
    InventoryDAO inventoryDAO = new InventoryDAO();
    Scanner input = new Scanner(System.in);

    @Override
    public JSONArray addItems(JSONArray array) {
        return inventoryDAO.addItems(array);
    }

    @Override
    public JSONArray editItems(JSONArray array, String name) {
        return inventoryDAO.editItems(array, name);
    }

    @Override
    public JSONArray removeItems(JSONArray array, String name) {
        return inventoryDAO.removeItems(array, name);
    }

    @Override
    public void displayItems(JSONArray array) {
        inventoryDAO.displayItems(array);
    }

    @Override
    public void totalValueOfInventory(JSONArray array) {
        inventoryDAO.totalValueOfInventory(array);
    }

    @Override
    public void totalWeightOfInventory(JSONArray array) {
        inventoryDAO.totalWeightOfInventory(array);
    }

    @Override
    public void totalPriceOfInventory(JSONArray array) {
        inventoryDAO.totalPriceOfInventory(array);
    }
}

