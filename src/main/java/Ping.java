import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.EventListener;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Ping extends ListenerAdapter implements EventListener, Commands {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split(" ");
        if (args[0].equalsIgnoreCase(prefix + "Ping")) {
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Pong! "+ event.getAuthor().getAsMention() + " Your ping is " + event.getJDA().getGatewayPing() + " ms").delay(2, SECONDS).complete();

        }
        super.onGuildMessageReceived(event);
    }
}
