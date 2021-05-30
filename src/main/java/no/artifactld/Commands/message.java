package no.artifactld.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class message implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args[0].equalsIgnoreCase("1")) {
            sender.sendMessage(ChatColor.AQUA + "サブコマンド1");
        } else if (args[0].equalsIgnoreCase("2")) {
            sender.sendMessage(ChatColor.YELLOW  + "サブコマンド2");
        } else {
            sender.sendMessage("サブコマンドは、1, 2しかありません");
        }

        return true;
    }
}
