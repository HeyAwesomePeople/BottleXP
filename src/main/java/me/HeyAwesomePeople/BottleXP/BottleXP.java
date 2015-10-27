package me.HeyAwesomePeople.BottleXP;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class BottleXP extends JavaPlugin implements CommandExecutor{
    public static BottleXP instance;

    @Override
    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(new ThrowListeners(), this);
    }

    @Override
    public void onDisable() {

    }

    public boolean onCommand(final CommandSender sender, Command cmd,
                             String commandLabel, final String[] args) {
        if (commandLabel.equalsIgnoreCase("xpbottle")) {
            if (!sender.hasPermission("xpbottle.xpbottle")) {
                sender.sendMessage(ChatColor.RED + "You do not have permissions to do this!");
                return false;
            }
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "You cannot run this command in the console.");
                return false;
            }
            Player p = (Player) sender;
            if (args.length == 0) {
                p.sendMessage(ChatColor.BLUE + "=== XPBottle ===");
                p.sendMessage(ChatColor.AQUA + "/xpbottle <exp> [player] - Give yourself or player an xp bottle");
            } else {
                if (args.length == 1) {
                    //TODO give player bottle
                    return false;
                }
                if (args.length == 2) {
                    //TODO give player bottle
                    return false;
                }
                return false;
            }
        }
        return false;
    }

}
