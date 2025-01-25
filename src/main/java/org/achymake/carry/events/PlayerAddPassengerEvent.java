package org.achymake.carry.events;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.checkerframework.checker.nullness.qual.NonNull;

public class PlayerAddPassengerEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final LivingEntity livingEntity;
    private boolean cancelled;
    public PlayerAddPassengerEvent(Player player, LivingEntity livingEntity) {
        this.player = player;
        this.livingEntity = livingEntity;
    }
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
    public Player getPlayer() {
        return player;
    }
    public LivingEntity getLivingEntity() {
        return livingEntity;
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