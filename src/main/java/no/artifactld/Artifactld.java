package no.artifactld;

import no.artifactld.Commands.countdown;
import no.artifactld.Commands.message;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.Objects;

public final class Artifactld extends JavaPlugin implements Listener {

    private static JavaPlugin plugin;

    public static String NoPermission = ChatColor.WHITE + "実行権限を持っていません!!!";

    private Inventory inv;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        getServer().getPluginManager().registerEvents(this,this);

        Objects.requireNonNull(getCommand("message")).setExecutor(new message());
        Objects.requireNonNull(getCommand("countdown")).setExecutor(new countdown());

        super.onEnable();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }
    @EventHandler
    public void ballFiring(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if (!(e.getAction() == Action.RIGHT_CLICK_AIR)) return;
        if (!(e.getItem().getType() == Material.NETHER_STAR)) return;
        inv = Bukkit.createInventory(null, 54, "メニュー");
    }




    @EventHandler
    public void onjoin(PlayerJoinEvent event){

        Player p = event.getPlayer();

        event.getPlayer().sendMessage(ChatColor.GOLD + "------------------------------\n" + ChatColor.WHITE + "    ようこそ " + ChatColor.AQUA + "HIMUHIMU Server " + ChatColor.WHITE + "へ!\n    何か困ったことがあったら、\n    himuhimu9191に相談してね！\n" + ChatColor.GOLD + "------------------------------\n");

        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "playsound minecraft:entity.player.levelup master " + p.getName() + " ~ ~ ~ 1 1 1");

        int random = (int)(Math.random() * 2300);
        if (random % 2300 == 0) {
            event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.GOLD + "伝説のクラフターの登場だ!  (超激レアメッセージ!!!)");
        } else {
            switch (random / 100) {

            default:  event.setJoinMessage(ChatColor.YELLOW + p.getName() + " join the game");

            case 1  : event.setJoinMessage(ChatColor.YELLOW + "あ！野生の" + ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が飛び出してきた！"); break;
            case 2  : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "がやってきました"); break;
            case 3  : event.setJoinMessage(ChatColor.YELLOW + "やったー、" + ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が来たー！"); break;
            case 4  : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が出たぞー！"); break;
            case 5  : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "がサーバーに加わりました"); break;
            case 6  : event.setJoinMessage(ChatColor.YELLOW + "やあ、" + ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "君 ピザ持ってきたよね?"); break;
            case 7  : event.setJoinMessage(ChatColor.AQUA + p.getName() + "にご挨拶しな！"); break;
            case 8  : event.setJoinMessage(ChatColor.YELLOW + "いらっしゃい" + ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "ちゃん ほら、ちゃんとご挨拶して！"); break;
            case 9  : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "がただいま着陸しました"); break;
            case 10 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "さん、お会いできて何よりです"); break;
            case 11 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "がサーバーに飛び乗りました"); break;
            case 12 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "がサーバーに滑り込みました"); break;
            case 13 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "がこのサバに平和をもたらしに来ました"); break;
            case 14 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "がサーバーを制圧しに来ました"); break;
            case 15 : event.setJoinMessage(ChatColor.YELLOW + "あ！ " + ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "だ！"); break;
            case 16 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "さん ようこそこのサーバーに！"); break;
            case 17 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が、殴りこみに来ました"); break;
            case 18 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が、TNT片手にやってきた！"); break;
            case 19 : event.setJoinMessage(ChatColor.YELLOW + "あ！ " + ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "じゃん ずっと会いたかったよー"); break;
            case 20 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が、サーバーにやってきました"); break;
            case 21 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が、シュルカーボックスから飛び出してきた！"); break;
            case 22 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "さんが 入室しました"); break;
            case 23 : event.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "さん　こんにちは"); break;
            /*case 24 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 25 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 26 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 27 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 28 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 29 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 30 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 31 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 32 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 33 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 34 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 35 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 36 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 37 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 38 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 39 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 40 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 41 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 42 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 43 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 44 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 45 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 46 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 47 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 48 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 49 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;
            case 50 : event.setJoinMessage(ChatColor.YELLOW + p.getName() + ""); break;*/
        }
        }
    }

    @EventHandler
    public void left (PlayerQuitEvent event) {
        Player p = event.getPlayer();

        int random = (int)(Math.random() * 900);
        if (random % 900 == 0) {
                event.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.GOLD + "がお帰りになられました   (激レアメッセージ !!)");
        } else {
            switch(random / 100) {
                default: event.setQuitMessage(ChatColor.YELLOW + p.getName() +" left the game");

                case 1 : event.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "さん さようなら!"); break;
                case 2 : event.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が 退出されました"); break;
                case 3 : event.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が サーバーから飛び降りた!"); break;
                case 4 : event.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が 華麗に去っていった"); break;
                case 5 : event.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "は 帰っていった"); break;
                case 6 : event.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "は 立ち去った"); break;
                case 7 : event.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "は 時間が来た"); break;
                case 8 : event.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "が いなくなった"); break;
                case 9 : event.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + "さんが いなくなっちゃった!"); break;
            }
        }
    }


    public static JavaPlugin getPlugin(){
        return plugin;
    }
}