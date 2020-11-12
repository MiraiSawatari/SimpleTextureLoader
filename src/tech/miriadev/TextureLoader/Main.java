package tech.miriadev.TextureLoader;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class Main extends JavaPlugin {
    public static Main instance;
    public static FileConfiguration config = null;
    public static HashMap<Player,Boolean> isSelected = new HashMap<>();

    @Override
    public void onEnable() {
        saveDefaultConfig();
        config = getConfig();
        instance = this;
        PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new JoinEvent(), this);
        getCommand("texture").setExecutor(new Command());
    }
}
