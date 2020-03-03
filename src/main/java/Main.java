import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

    public static void main(String[] args) throws Exception {
        JDA jda = new JDABuilder(AccountType.BOT).setToken("NjgyNjUzMTI3NjQzNDk2NjAz.Xl6Vhw.wVG06llU3LQWB_gGXDge6lwO7tU").build();
        jda.addEventListener(new Ping(), new SendImage());
    }
}