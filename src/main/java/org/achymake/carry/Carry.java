package org.achymake.carry;

import org.bukkit.plugin.java.JavaPlugin;

public final class Carry extends JavaPlugin {
    private static Carry instance;
    @Override
    public void onEnable() {
        instance = this;
    }
    @Override
    public void onDisable() {
    }
    public static Carry getInstance() {
        return instance;
    }
}