package me.HeyAwesomePeople.BottleXP;

import org.bukkit.Bukkit;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.UUID;

public class ThrowListeners implements Listener {

    @EventHandler
    public void onPlayerThrowXpBottle(ExpBottleEvent e) {
        ThrownExpBottle bottle = e.getEntity();
        if (e.getEntity().getShooter() instanceof Player) {
            Player shooter = (Player) e.getEntity().getShooter();
            ItemMeta m = shooter.getItemInHand().getItemMeta();
            if (!m.hasLore()) return;
            if (m.getLore().get(0) == null) return;
            if (!m.getLore().get(0).contains(":")) return;
            Integer i = Integer.parseInt(m.getLore().get(0).split(":")[1].replace(" ", ""));
            ((ExperienceOrb)e.getEntity().getLocation().getWorld().spawn(e.getEntity().getLocation(), ExperienceOrb.class)).setExperience(i);
            e.setExperience(0);
        }
    }

    @EventHandler
    public void onXpPickupEvent(EntityTargetLivingEntityEvent e) {
        if (e.getEntity() instanceof ExperienceOrb && e.getTarget() instanceof Player) {
            
        }
    }

    @EventHandler
    public void onThrowPotion(PotionSplashEvent e) {

    }

}