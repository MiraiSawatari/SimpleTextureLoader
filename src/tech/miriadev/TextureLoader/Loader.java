package tech.miriadev.TextureLoader;

import org.bukkit.entity.Player;

public class Loader {
    public static void load(String url, Player p) {
        p.setResourcePack(url);
    }
}