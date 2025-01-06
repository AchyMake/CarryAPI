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
    private final Entity entity;
    private final Block block;
    private boolean cancelled;
    public PlayerEjectPassengerEvent(Player player, Entity entity, Block block) {
        this.player = player;
        this.entity = entity;
        this.block = block;
    }
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
    public Player getPlayer() {
        return player;
    }
    public Entity getEntity() {
        return entity;
    }
    public Block getBlock() {
        return block;
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