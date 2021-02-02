package examenconvocatoria;

import examenconvocatoria.model.Item;
import examenconvocatoria.view.AuctionDisplay;

public class MockAuctionDisplay implements AuctionDisplay {

    @Override
    public void display(Item item) {
        System.out.println("Displaying: " + item.getName());
    }
}
