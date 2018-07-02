/**
 * Developed by Mamizu0312
 * github: github.com/Mamizu0312
 * Twitter: @_Mamizu
 */

package red.man10.man10apologems;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

public final class Man10Apologems extends JavaPlugin {

    MySQLManager mysql;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        mysql = new MySQLManager(this, "man10Apologems");
        getCommand("mag").setExecutor(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
