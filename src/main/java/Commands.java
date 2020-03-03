import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public interface Commands {
    void onGuildMessageReceived(GuildMessageReceivedEvent event);
    String prefix = ".";
}
