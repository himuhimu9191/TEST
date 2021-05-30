package no.artifactld.Commands;


import no.artifactld.Artifactld;
import no.artifactld.Timer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class countdown implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission("Himuhimupack.command.countdown") || sender.isOp()) {
            Timer.cowntdown(args, sender);
        } else {sender.sendMessage(Artifactld.NoPermission);}

        return true;
    }
}