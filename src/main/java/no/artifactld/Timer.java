package no.artifactld;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

public class Timer {

    public static int count;

    public static void cowntdown(String sum[], CommandSender p) {

        Bukkit.broadcastMessage(ChatColor.GOLD + "カウントダウン" + sum[0] + "秒で、開始!!");

        count = Integer.parseInt(sum[0]);

        BukkitRunnable task = new BukkitRunnable() {

            public void run() {
                if (count == 0){
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "------------" + ChatColor.RED + "\n残り0秒になりました!!!\nカウントダウンを中止します\n" + ChatColor.YELLOW + "------------");
                    Bukkit.dispatchCommand(p, "playsound minecraft:entity.player.levelup master @a ~ ~ ~ 1 1 1");
                    this.cancel();
                } else if (count % 3600 == 0) {
                    Bukkit.broadcastMessage(ChatColor.GREEN + "残り" + count / 3600 + "時間");
                    Bukkit.dispatchCommand(p, "playsound minecraft:ui.button.click master @a ~ ~ ~ 1 1 1");
                } else if ((count % 60 == 0 && count <= 600) || count % 600 == 0) {
                    Bukkit.broadcastMessage(ChatColor.AQUA + "残り" + count / 60 + "分");
                    Bukkit.dispatchCommand(p, "playsound minecraft:ui.button.click master @a ~ ~ ~ 1 1 1");
                } else if (count > 60 && count < 600 && count % 10 == 0) {
                    Bukkit.broadcastMessage("残り" + count / 60 + "分" + count % 60 + "秒");
                    Bukkit.dispatchCommand(p, "playsound minecraft:ui.button.click master @a ~ ~ ~ 1 1 1");
                } else if (count <= 10) {
                    Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "残り" + count + "秒");
                    Bukkit.dispatchCommand(p, "playsound minecraft:ui.button.click master @a ~ ~ ~ 1 1 1");
                } else if (count % 10 == 0 && count < 60) {
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "残り" + count + "秒");
                    Bukkit.dispatchCommand(p, "playsound minecraft:ui.button.click master @a ~ ~ ~ 1 1 1");
                }

                count--;
            }
        };
        task.runTaskTimer(Artifactld.getPlugin(),0L,20L);
    }

}
