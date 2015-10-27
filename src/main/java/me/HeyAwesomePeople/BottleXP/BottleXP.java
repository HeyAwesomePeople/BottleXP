package me.HeyAwesomePeople.BottleXP;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
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

        return false;
    }

}
