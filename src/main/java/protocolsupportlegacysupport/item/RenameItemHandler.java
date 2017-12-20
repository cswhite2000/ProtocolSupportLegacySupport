package protocolsupportlegacysupport.item;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.inventory.meta.ItemMeta;
import protocolsupport.api.events.ItemStackWriteEvent;
import protocolsupportlegacysupport.ProtocolSupportLegacySupport;

public class RenameItemHandler implements Listener {

    public void start() {
        Bukkit.getPluginManager().registerEvents(this, ProtocolSupportLegacySupport.getInstance());
    }

    @EventHandler(priority= EventPriority.HIGHEST, ignoreCancelled=true)
    public void onItemStackWrite(ItemStackWriteEvent event) {
        if (event.getOriginal() != event.getResult() && !event.getOriginal().getItemMeta().hasDisplayName()) {
            ItemMeta meta = event.getResult().getItemMeta();
            meta.setDisplayName("§ftranslations." + event.getOriginal().getType().name() + "." + event.getLocale());
            event.getResult().setItemMeta(meta);
        }
    }

}
