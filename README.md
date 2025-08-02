Check Repository = https://jitpack.io/#AchyMake/CarryAPI
```xml
<repositories>
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.AchyMake</groupId>
        <artifactId>CarryAPI</artifactId>
        <version>LATEST</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
Example

```java
package org.example.yourplugin;

import org.achymake.carry.events.PlayerAddPassengerEvent;
import org.achymake.carry.events.PlayerEjectPassengerEvent;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerAddPassenger implements Listener {
    private YourPlugin getInstance() {
        return YourPlugin.getInstance();
    }
    private PluginManager getPluginManager() {
        return getInstance().getPluginManager();
    }
    public PlayerAddPassenger() {
        getPluginManager().registerEvents(this, getInstance());
    }
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerAddPassenger(PlayerAddPassengerEvent event) {
        var player = event.getPlayer();
        var rightClicked = event.getRightClicked();
        //cancel event if you want
        event.setCancelled(true);
    }
}

public class PlayerEjectPassenger implements Listener {
    private YourPlugin getInstance() {
        return YourPlugin.getInstance();
    }
    private PluginManager getPluginManager() {
        return getInstance().getPluginManager();
    }
    public PlayerEjectPassenger() {
        getPluginManager().registerEvents(this, getInstance());
    }
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerEjectPassenger(PlayerEjectPassengerEvent event) {
        var player = event.getPlayer();
        var passenger = event.getPassenger();
        var clickedBlock = event.getClickedBlock();
        //cancel event if you want
        event.setCancelled(true);
    }
}
```