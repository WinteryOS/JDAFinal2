import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

    public static void main(String[] args) throws Exception {
        JDA jda = new JDABuilder(AccountType.BOT).setToken("NjgyNjUzMTI3NjQzNDk2NjAz.XlgJEw.NePTn2-8dfxdBZbeEWp_EVzNmtQ").build();
    }
}