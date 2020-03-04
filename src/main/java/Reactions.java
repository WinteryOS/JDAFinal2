import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.EventListener;

public class Reactions extends ListenerAdapter implements EventListener, Commands {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        //TODO FILL OUT SWEAR LIST (GET CREATIVE)
        String[] badWords = {"Ass", "Damn", "Frick", "Poop"};
        String joe = badWords[0];
        String joe1 = badWords[1];
        String joe2 = badWords[2];
        String[] args = event.getMessage().getContentRaw().split(" "); //Gets user message split
        if (args[0].contains(joe) || args[0].contains(joe1) || args[0].contains(joe2) ||
                args[0].contains(joe.toLowerCase()) || args[0].contains(joe.toUpperCase())
            ) {
            System.out.println("User has said bad word");
            event.getChannel().sendMessage("Don't Swear " + event.getAuthor().getAsMention()).queue();
            event.getMessage().delete().queue();
            event.getAuthor().openPrivateChannel().queue();

    }

    }
}
