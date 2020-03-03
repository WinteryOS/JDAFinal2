import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;
import java.util.EventListener;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SendImage extends ListenerAdapter implements EventListener, Commands {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split(" ");
        if (args[0].equalsIgnoreCase(prefix + "cat")) {
            String randomCat1 = "C:\\Users\\Kolby\\Desktop\\JDAFinal\\src\\main\\java\\cat.jpg";
            event.getChannel().sendTyping().delay(1, SECONDS).queue();
            event.getChannel().sendFile(new File(randomCat1)).complete();
        }
    }
}
