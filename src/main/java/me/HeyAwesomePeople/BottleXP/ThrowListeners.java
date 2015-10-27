package me.HeyAwesomePeople.BottleXP;

import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.entity.PotionSplashEvent;

public class ThrowListeners implements Listener {

    @EventHandler
    public void onPlayerThrowXpBottle(ExpBottleEvent e) {
        ThrownExpBottle bottle = e.getEntity();

    }

    @EventHandler
    public void onXpBottleThrown(PotionSplashEvent e) {

    }

}