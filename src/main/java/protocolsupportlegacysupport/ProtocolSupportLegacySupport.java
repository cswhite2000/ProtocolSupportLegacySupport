package protocolsupportlegacysupport;

import org.bukkit.plugin.java.JavaPlugin;
import protocolsupportlegacysupport.brewingstandfuel.BrewingStandFuelHandler;
import protocolsupportlegacysupport.enchantingtable.EnchantingTableHandler;
import protocolsupportlegacysupport.item.RenameItemHandler;

public class ProtocolSupportLegacySupport extends JavaPlugin {
    private static ProtocolSupportLegacySupport instance;

    public ProtocolSupportLegacySupport() {
        instance = this;
    }

    public static ProtocolSupportLegacySupport getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        new BrewingStandFuelHandler().start();
        new EnchantingTableHandler().start();
        new RenameItemHandler().start();
    }

}
