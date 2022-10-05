package jean.sodois.main;

import java.util.EnumSet;

import javax.security.auth.login.LoginException;

import jean.sodois.comandos.Comando;
import jean.sodois.comandos.EventBotton;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
	
	public static JDA jda;
	
	public static void main (String[] args) throws LoginException {	

		JDA jda = JDABuilder.create("OTczMzc3OTAyMjgyNDA4MDI2.GF20Xj.gWDBoVMebpWAxQVhaGK_Y4UvfKZsmik5LTJPN4", EnumSet.allOf(GatewayIntent.class)).build();
		jda.addEventListener(new Comando());
		jda.addEventListener(new EventBotton());
		System.out.println("aa pego");
		
	}
	
	
	

}
