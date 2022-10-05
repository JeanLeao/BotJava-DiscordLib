package jean.sodois.comandos;


import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

public class Comando extends ListenerAdapter{
	public String p = "s!";
	
	     public static int jgr = 0;
	     public static int jogo = 0;

		
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		/*/ VERIFICAÇÃO DE CANAL DE MENSAGEM - RANK POINTS/*/
		
		String[] args = event.getMessage().getContentRaw().split(" ");
	if(event.getTextChannel() == event.getGuild().getTextChannelById("974119101926621184")) {
			event.getGuild().removeRoleFromMember(event.getMember(), event.getGuild().getRoleById("974119329643782144")).queue();
			return;	
			}
	
		/*/VERIFICAÇÃO CHAT GERAL/*/
		if(args[0].equalsIgnoreCase(p)) {	
		if(event.getChannel() == event.getGuild().getTextChannelById("974122131694690364")) {
			if(args [1].equalsIgnoreCase("showmatch") && (jgr == 5) || (args [1].equalsIgnoreCase("showmatch") && (jogo == 0))) {
				event.getMessage().delete().queue();
				jogo++; 
				jgr = 0;		
				System.out.print(jogo);
				System.out.print(jgr);
				EmbedBuilder caixa = new EmbedBuilder();
				caixa.setColor(Color.GREEN);
				caixa.setTitle("NOVA PARTIDA! #" + jogo);
				caixa.setDescription("Para jogar clique no botão abaixo.");
				caixa.setFooter("Partida criada por:" + event.getAuthor().getAsMention());
				//event.getTextChannel().deleteMessages(event.getGuild().getTextChannelById("974122131694690364").getHistory().retrievePast(20).complete()).queue();
				event.getChannel().sendMessageEmbeds(caixa.build()).setActionRow(Button.success("Verifique", "Para jogar")).queue();
				return;
			
		}else {
			if ((jogo == 4) && ( jgr == 4)) {
				EmbedBuilder ebfull = new EmbedBuilder();
				ebfull.setColor(Color.RED);
				ebfull.setTitle("JOGOS LOTADOS, AGUARDE UM POUCO");
				ebfull.setDescription("Jogos em partida " + jogo + "/4");
				event.getMessage().getChannel().sendMessageEmbeds(ebfull.build()).queue();
			} else { event.getMessage().delete().queue(); }
		}}}}}

	
	
	
	
	

	
	
	
	
	
	
/*/ OBJETOS PARA RETORNAR/*/	
	
	
	
	

	

	
			
		
	
	

	

	
	
	
	
/*/  StringBuilder sb = new StringBuilder();
for (Member membro : guild.getMembersWithRoles(guild.getRoleById("973782620125163531"))) {
	sb.append(membro.getIdLong()).append("\n");
}
String[] id2 = new String[sb.length()];
id2 = sb.toString().split("\n");
for (int Valores = 0; Valores < id2.length; Valores++) {
	e.getChannel().sendMessage(id2[Valores]).queue();	
	guild.addRoleToMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782087331098655")).queue();
} /*/

			
		
	


