package tech.miriadev.TextureLoader;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player p = (Player) commandSender;
            String url = Main.config.getString("url", "https://cdn.mckarbon.com/textures/natu.zip");
            Loader loader = new Loader();
            loader.load(url,p);
        }
        return true;
    }
}
