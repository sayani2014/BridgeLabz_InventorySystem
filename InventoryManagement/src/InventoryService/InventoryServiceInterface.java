package InventoryService;

import org.json.JSONArray;


public interface InventoryServiceInterface {
    abstract JSONArray addItems(JSONArray array);
    abstract JSONArray editItems(JSONArray array,String name);
    abstract JSONArray removeItems(JSONArray array,String name);
    abstract void displayItems(JSONArray array);
    abstract void totalValueOfInventory(JSONArray array);
    abstract void totalWeightOfInventory(JSONArray array);
    abstract void totalPriceOfInventory(JSONArray array);
}
