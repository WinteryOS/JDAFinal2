import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;
import java.util.EventListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SendImage extends ListenerAdapter implements EventListener, Commands {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split(" ");
        if (args[0].equalsIgnoreCase(prefix + "cat")) {
            event.getChannel().sendTyping().delay(1, SECONDS).queue();
            event.getChannel().sendFile(new File(randomCat())).complete();
        }
    }

    public String randomCat(){
        Random rng = new Random();
        int joe = 0;
        for(int i = 0; i < 1; i++) {
            joe = rng.nextInt(3) + 1;
        }
        if(joe == 1){
            return "C:\\Users\\Kolby\\Desktop\\JDAFinal\\src\\main\\java\\Images\\cat.jpg";
        }
        if(joe == 2){
            return "C:\\Users\\Kolby\\Desktop\\JDAFinal\\src\\main\\java\\Images\\cat2.jpg";
        }
        if(joe == 3){
            return "C:\\Users\\Kolby\\Desktop\\JDAFinal\\src\\main\\java\\Images\\cat3.jpeg";
        }
        else{
            return "C:\\Users\\Kolby\\Desktop\\JDAFinal\\src\\main\\java\\Images\\cat3.jpeg";
        }
    }
}
