package tech.miriadev.TextureLoader;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        String url = Main.config.getString("url", "");
        Loader loader = new Loader();
        loader.load(url,e.getPlayer());
    }
}

