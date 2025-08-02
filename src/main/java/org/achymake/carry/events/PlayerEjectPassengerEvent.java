package org.achymake.carry.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.checkerframework.checker.nullness.qual.NonNull;

public class PlayerEjectPassengerEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final Entity passenger;
    private final Block clickedBlock;
    private boolean cancelled;
    public PlayerEjectPassengerEvent(Player player, Entity passenger, Block clickedBlock) {
        this.player = player;
        this.passenger = passenger;
        this.clickedBlock = clickedBlock;
    }
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
    public Player getPlayer() {
        return player;
    }
    public Entity getPassenger() {
        return passenger;
    }
    public Block getClickedBlock() {
        return clickedBlock;
    }
    public boolean isCancelled() {
        return cancelled;
    }
    public @NonNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}