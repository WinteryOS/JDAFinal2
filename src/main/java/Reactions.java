import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.EventListener;

public class Reactions extends ListenerAdapter implements EventListener, Commands {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] badWords = {"Joe"};
        String joe = badWords[0];
        String[] args = event.getMessage().getContentRaw().split(" ");
        if (args[0].contains(joe)) {
            System.out.println("User has said bad word");
            event.getMessage().delete().queue();
            event.getAuthor().openPrivateChannel().queue();




        }

    }
}
