package examenconvocatoria.control;

import examenconvocatoria.MockAuctionLoader;
import examenconvocatoria.model.Item;
import examenconvocatoria.view.AuctionDisplay;
import examenconvocatoria.view.AuctionListDisplay;
import examenconvocatoria.view.AuctionLoader;
import java.util.List;

public class MonitorAuctionCommand implements Command {
    private final AuctionListDisplay auctionListDisplay;
    private final AuctionDisplay auctionDisplay;
    private final AuctionLoader auctionLoader;

    public MonitorAuctionCommand(AuctionListDisplay auctionListDisplay, AuctionDisplay auctionDisplay, AuctionLoader auctionLoader) {
        this.auctionListDisplay = auctionListDisplay;
        this.auctionDisplay = auctionDisplay;
        this.auctionLoader = auctionLoader;
    }
    
    @Override
    public void execute() {
        this.auctionListDisplay.display(auctionLoader.load());
    }
}
