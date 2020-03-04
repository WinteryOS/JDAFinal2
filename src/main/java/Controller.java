import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import static sun.rmi.transport.TransportConstants.Ping;

public class  Controller {

    public void run() throws Exception{
        JDA jda = new JDABuilder(AccountType.BOT).setToken("NjgyNjUzMTI3NjQzNDk2NjAz.Xl6wTw.JpOMQZvkWP5HoIELlzQjyBOm42w").build();
        jda.addEventListener(new Ping(), new SendImage(), new Reactions());
    }
}
