package com.ch1ck3n.salmonac.checks.movement.sprinting;

import com.ch1ck3n.salmonac.checks.Check;
import com.ch1ck3n.salmonac.events.SalmonMoveEvent;
import org.bukkit.event.EventHandler;

public class SprintingC extends Check {
    public SprintingC(String name, Category category, Punishment punishment, String description) {
        super(name, category, punishment, description);
        this.setType("Sneak");
        this.setSubCategory("Sprinting");
        this.setVlPerFail(4.0f);
    }

    @EventHandler
    public void onMove(SalmonMoveEvent e) {
        // Type C
        if( e.getPlayer().isSneaking() && e.getPlayer().isSprinting() ) {
            flag(e.getPlayer(), "Sneaking = " + e.getPlayer().isSneaking() +
                    "\nSprinting = " + e.getPlayer().isSprinting());
        }
    }
}
