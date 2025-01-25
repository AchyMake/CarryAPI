package org.achymake.carry.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.entity.Player;
import org.bukkit.entity.LivingEntity;
import org.bukkit.block.Block;
import org.checkerframework.checker.nullness.qual.NonNull;

public class PlayerEjectPassengerEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final LivingEntity livingEntity;
    private final Block ClickedBlock;
    private boolean cancelled;
    public PlayerEjectPassengerEvent(Player player, LivingEntity livingEntity, Block block) {
        this.player = player;
        this.livingEntity = livingEntity;
        this.ClickedBlock = block;
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
    public Block getClickedBlock() {
        return ClickedBlock;
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