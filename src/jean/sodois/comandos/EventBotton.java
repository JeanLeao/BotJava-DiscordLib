package jean.sodois.comandos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.VoiceChannel;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

public class EventBotton extends ListenerAdapter{
	public String p = "s!";
	Comando classa;

	
/*/ALEATORIAR MAPAS == VARIAVEIS/*/
	int a = aleatoriar(0,4);
	 String[] mapas = {"Sandstone", "Zone9", "Province", "Sakura", "Rust"};
public static int aleatoriar(int minimo, int maximo) {
	 Random random = new Random();
	 return random.nextInt((maximo - minimo) + 1) + minimo;
}


	@Override
	public void onButtonInteraction(ButtonInteractionEvent e) {
		Guild guild = e.getGuild();
		Member member = guild.getMember(e.getMember());	
		//VOICE 1
        VoiceChannel voiceChannel = guild.getVoiceChannelById("973655302945796167");
        VoiceChannel voiceChannel2 = guild.getVoiceChannelById("973654938603360296");
		//VOICE 2
        VoiceChannel voiceChanne1l = guild.getVoiceChannelById("973654978512187472");
        VoiceChannel voiceChanne1l2 = guild.getVoiceChannelById("973655380280361000");
		//VOICE 3
        VoiceChannel voiceChanne2l = guild.getVoiceChannelById("973655429987045386");
        VoiceChannel voiceChanne2l2 = guild.getVoiceChannelById("973655453038952460");
		//VOICE 4
        VoiceChannel voiceChanne3l = guild.getVoiceChannelById("973655479114936350");
        VoiceChannel voiceChanne3l2 = guild.getVoiceChannelById("973655506705068083");
		Timer verif = new Timer();
		final long SEGUNDOS = (1000*4);
		TimerTask  tarefa = new TimerTask() {
			int Valoresrestantes = 0;
			
			@Override
			public void run() {
				System.out.print("Verificação \n");
				/*/GRUPO 1/*/
				if(Comando.jgr == 4 && Comando.jogo == 1) {
					StringBuilder sb = new StringBuilder();
					for (Member membro : guild.getMembersWithRoles(guild.getRoleById("974327001089466369"))) {
						sb.append(membro.getIdLong()).append("\n");
					}
					String[] id2 = new String[sb.length()];
					id2 = sb.toString().split("\n");
					
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChannel).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782395599847464")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChannel).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782395599847464")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChannel2).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782395599847464")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChannel2).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782395599847464")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes = 0;
						Comando.jgr = 5;
						
				/*/ GRUPO 2 /*/		
				}else if(Comando.jgr == 4 && Comando.jogo == 2){
					
					StringBuilder sb = new StringBuilder();
					for (Member membro : guild.getMembersWithRoles(guild.getRoleById("974327001089466369"))) {
						sb.append(membro.getIdLong()).append("\n");
					}
					String[] id2 = new String[sb.length()];
					id2 = sb.toString().split("\n");
					
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne1l).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782974808076289")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne1l).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782974808076289")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne1l2).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782974808076289")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne1l2).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782974808076289")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						
						Valoresrestantes = 0;
						Comando.jgr = 5;
						
				/*/GRUPO 3/*/	
				}else if(Comando.jgr == 4 && Comando.jogo == 3){
					StringBuilder sb = new StringBuilder();
					for (Member membro : guild.getMembersWithRoles(guild.getRoleById("974327001089466369"))) {
						sb.append(membro.getIdLong()).append("\n");
					}
					String[] id2 = new String[sb.length()];
					id2 = sb.toString().split("\n");
					
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne2l).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973783003392245864")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne2l).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973783003392245864")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne2l2).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973783003392245864")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne2l2).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973783003392245864")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						
						Valoresrestantes = 0;
						Comando.jgr = 5;
				/*/GRUPO 4/*/	
				}else if(Comando.jgr == 4 && Comando.jogo == 4){
					StringBuilder sb = new StringBuilder();
					for (Member membro : guild.getMembersWithRoles(guild.getRoleById("974327001089466369"))) {
						sb.append(membro.getIdLong()).append("\n");
					}
					String[] id2 = new String[sb.length()];
					id2 = sb.toString().split("\n");
					
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne3l).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973783051555438612")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne3l).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973783051555438612")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne3l2).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973783051555438612")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						Valoresrestantes++;
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973782087331098655")).queue();
						guild.moveVoiceMember(guild.getMemberById(id2[Valoresrestantes]), voiceChanne3l2).complete();
						guild.addRoleToMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("973783051555438612")).queue();
						guild.removeRoleFromMember(guild.getMemberById(id2[Valoresrestantes]), guild.getRoleById("974327001089466369")).queue();
						
						Valoresrestantes = 0;
						Comando.jgr = 5;
				}
				
			}}; 
		
		
		
		
if (e.getMember().getVoiceState().getChannel() == e.getGuild().getVoiceChannelById("970120806279553125")) {
	if (member.getRoles().contains(guild.getRoleById("974327001089466369")))	{
	return;}else {
/*/TEAM 1 /*/
		if (e.getComponentId().equalsIgnoreCase("Verifique") && (Comando.jogo == 1) && (Comando.jgr <=3)) {
			verif.scheduleAtFixedRate(tarefa, 0, SEGUNDOS);
			System.out.print(Comando.jgr);
			guild.addRoleToMember(e.getMember(), guild.getRoleById("974327001089466369")).queue();
			e.getGuild().getTextChannelById("974326838602129429").sendMessage("Caso queira sair da fila aperte.").setActionRow(Button.success("Sair", "Quero Sair")).queue();
			Comando.jgr ++;
			
			if(Comando.jgr == 4 && Comando.jogo == 1) {
				EmbedBuilder EventChat = new EmbedBuilder();
				EventChat.setTitle("COMEÇOU");
				EventChat.setDescription("Entrem em concenso, E PEGUEM SEUS ID'S");
				EventChat.setColor(Color.GREEN);
					guild.getTextChannelById("973655896045531237").sendMessageEmbeds(EventChat.build()).setActionRow(enviarBotao()).queue();
			}
			
		return;}
		
		
		
// TEAM 2
		
		if (e.getComponentId().equalsIgnoreCase("Verifique") && (Comando.jgr <= 3) && (Comando.jogo == 2)) {
				verif.scheduleAtFixedRate(tarefa, 0, SEGUNDOS);
				Comando.jgr ++;	
				System.out.print(Comando.jgr);
				guild.addRoleToMember(e.getMember(), guild.getRoleById("974327001089466369")).queue();
				e.getGuild().getTextChannelById("974326838602129429").deleteMessages(guild.getTextChannelById("974326838602129429").getHistory().retrievePast(5).complete()).queue();
				e.getGuild().getTextChannelById("974326838602129429").sendMessage("Caso queira sair da fila aperte.").setActionRow(Button.success("Sair", "Quero Sair")).queue();
			
		if(Comando.jgr == 4 && Comando.jogo == 2) {
			EmbedBuilder EventChat = new EmbedBuilder();
			EventChat.setTitle("COMEÇOU");
			EventChat.setDescription("Entrem em concenso, E PEGUEM SEUS ID'S");
			EventChat.setColor(Color.GREEN);
				guild.getTextChannelById("973655921970532392").sendMessageEmbeds(EventChat.build()).setActionRow(enviarBotao1()).queue();
		}return;}
		
		// TEAM 3
		
		if (e.getComponentId().equalsIgnoreCase("Verifique") && (Comando.jgr <=3) && (Comando.jogo == 3)) {
			verif.scheduleAtFixedRate(tarefa, 0, SEGUNDOS);
				Comando.jgr ++;	
				System.out.print(Comando.jgr);
				guild.addRoleToMember(e.getMember(), guild.getRoleById("974327001089466369")).queue();
				e.getGuild().getTextChannelById("974326838602129429").deleteMessages(guild.getTextChannelById("974326838602129429").getHistory().retrievePast(5).complete()).queue();
				e.getGuild().getTextChannelById("974326838602129429").sendMessage("Caso queira sair da fila aperte.").setActionRow(Button.success("Sair", "Quero Sair")).queue();	
		if(Comando.jgr == 4 && Comando.jogo == 3) {
			EmbedBuilder EventChat = new EmbedBuilder();
			EventChat.setTitle("COMEÇOU");
			EventChat.setDescription("Entrem em concenso, E PEGUEM SEUS ID'S");
			EventChat.setColor(Color.GREEN);
			    guild.getTextChannelById("973655977872207892").sendMessageEmbeds(EventChat.build()).setActionRow(enviarBotao2()).queue();
		}return;}
		
		// TEAM  4
		
		if (e.getComponentId().equalsIgnoreCase("Verifique") && (Comando.jgr <= 3) && (Comando.jogo == 4)) {
			verif.scheduleAtFixedRate(tarefa, 0, SEGUNDOS);
				Comando.jgr ++;	
				System.out.print(Comando.jgr);
				guild.addRoleToMember(e.getMember(), guild.getRoleById("974327001089466369")).queue();
				e.getGuild().getTextChannelById("974326838602129429").deleteMessages(guild.getTextChannelById("974326838602129429").getHistory().retrievePast(5).complete()).queue();
				e.getGuild().getTextChannelById("974326838602129429").sendMessage("Caso queira sair da fila aperte.").setActionRow(Button.success("Sair", "Quero Sair")).queue();
			
		if(Comando.jgr == 4 && Comando.jogo == 4) {
			EmbedBuilder EventChat = new EmbedBuilder();
			EventChat.setTitle("COMEÇOU");
			EventChat.setDescription("Entrem em concenso, E PEGUEM SEUS ID'S");
			EventChat.setColor(Color.GREEN);
				e.getGuild().getTextChannelById("973656005189705758").deleteMessages(guild.getTextChannelById("973656005189705758").getHistory().retrievePast(13).complete()).queue();
				guild.getTextChannelById("973656005189705758").sendMessageEmbeds(EventChat.build()).setActionRow(enviarBotao3()).queue();
				}return;}
		}
	e.getChannel().sendMessage("ABRA UMA NOVA PARTIDA!, A ATUAL ESTÁ LOTADA.");
	return;}
	


//PROCESSO DE BOTÕES DENTRO DO GAMING
	VoiceChannel geral = guild.getVoiceChannelById("968294307419275324");
	
	if (e.getComponentId().equalsIgnoreCase("EQVENCEU")) {

		StringBuilder sb = new StringBuilder();
		for (Member membro : guild.getMembersWithRoles(guild.getRoleById("973782395599847464"))) {
			sb.append(membro.getIdLong()).append("\n");
		}
		String[] id2 = new String[sb.length()];
		id2 = sb.toString().split("\n");
		for (int Valores = 0; Valores < id2.length; Valores++) {
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782087331098655")).queue();
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782395599847464")).queue();
			guild.addRoleToMember(guild.getMemberById(id2[Valores]), guild.getRoleById("974119329643782144")).queue();
			guild.moveVoiceMember(guild.getMemberById(id2[Valores]), geral).complete();
		}
		Comando.jogo--;
		return;} 
	
	if(e.getComponentId().equalsIgnoreCase("Relatar")){

		StringBuilder sb = new StringBuilder();
		for (Member membro : guild.getMembersWithRoles(guild.getRoleById("973782395599847464"))) {
			sb.append(membro.getIdLong()).append("\n");
		}
		String[] id2 = new String[sb.length()];
		id2 = sb.toString().split("\n");
		for (int Valores = 0; Valores < id2.length; Valores++) {
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782087331098655")).queue();
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782395599847464")).queue();
			guild.moveVoiceMember(guild.getMemberById(id2[Valores]), geral).complete();
		}
		Comando.jogo--;
		return;}
	if(e.getComponentId().equalsIgnoreCase("Sortear")){
		a = 0;
		int a = aleatoriar(0,4);
		guild.getTextChannelById("973655896045531237").sendMessage("AO USAR MAPA VOCE RECBE BONUS DE PONTOS +1 \n O mapa da vez é: " + mapas[a]).queue();

		return;
	}
	
	//TEAM 2
	if(e.getComponentId().equalsIgnoreCase("EQVENCEU1")){
		StringBuilder sb = new StringBuilder();
		for (Member membro : guild.getMembersWithRoles(guild.getRoleById("973782974808076289"))) {
			sb.append(membro.getIdLong()).append("\n");
		}
		String[] id2 = new String[sb.length()];
		id2 = sb.toString().split("\n");
		for (int Valores = 0; Valores < id2.length; Valores++) {
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782087331098655")).queue();
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782974808076289")).queue();
			guild.addRoleToMember(guild.getMemberById(id2[Valores]), guild.getRoleById("974119329643782144")).queue();
			guild.moveVoiceMember(guild.getMemberById(id2[Valores]), geral).complete();
		}
		Comando.jogo--;
		return;}
	
	if(e.getComponentId().equalsIgnoreCase("Relatar1")){
		
		StringBuilder sb = new StringBuilder();
		for (Member membro : guild.getMembersWithRoles(guild.getRoleById("973782974808076289"))) {
			sb.append(membro.getIdLong()).append("\n");
		}
		String[] id2 = new String[sb.length()];
		id2 = sb.toString().split("\n");
		for (int Valores = 0; Valores < id2.length; Valores++) {
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782087331098655")).queue();
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782974808076289")).queue();
			guild.moveVoiceMember(guild.getMemberById(id2[Valores]), geral).complete();
		}
		Comando.jogo--;
		return;
	}
	if(e.getComponentId().equalsIgnoreCase("Sortear1")){
		a = 0;
		int a = aleatoriar(0,4);
		guild.getTextChannelById("973655921970532392").sendMessage("AO USAR MAPA VOCE RECBE BONUS DE PONTOS +1 \n O mapa da vez é: " + mapas[a]).queue();
		return;
	}
	
	//TEAM 3
	if(e.getComponentId().equalsIgnoreCase("EQVENCEU2")){
		StringBuilder sb = new StringBuilder();
		for (Member membro : guild.getMembersWithRoles(guild.getRoleById("973783003392245864"))) {
			sb.append(membro.getIdLong()).append("\n");
		}
		String[] id2 = new String[sb.length()];
		id2 = sb.toString().split("\n");
		for (int Valores = 0; Valores < id2.length; Valores++) {
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782087331098655")).queue();
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973783003392245864")).queue();
			guild.addRoleToMember(guild.getMemberById(id2[Valores]), guild.getRoleById("974119329643782144")).queue();
			guild.moveVoiceMember(guild.getMemberById(id2[Valores]), geral).complete();
		}
		Comando.jogo--;
		return;}
	if(e.getComponentId().equalsIgnoreCase("Relatar2")){
		StringBuilder sb = new StringBuilder();
		for (Member membro : guild.getMembersWithRoles(guild.getRoleById("973783003392245864"))) {
			sb.append(membro.getIdLong()).append("\n");
		}
		String[] id2 = new String[sb.length()];
		id2 = sb.toString().split("\n");
		for (int Valores = 0; Valores < id2.length; Valores++) {
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782087331098655")).queue();
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973783003392245864")).queue();
			guild.moveVoiceMember(guild.getMemberById(id2[Valores]), geral).complete();
		}
		Comando.jogo--;
		
		return;	
	}
	if(e.getComponentId().equalsIgnoreCase("Sortear2")){
		a = 0;
		int a = aleatoriar(0,4);
		guild.getTextChannelById("973655977872207892").sendMessage("AO USAR MAPA VOCE RECBE BONUS DE PONTOS +1 \n O mapa da vez é: " + mapas[a]).queue();
		return;
	}
	
	//TEAM 4
	if(e.getComponentId().equalsIgnoreCase("EQVENCEU3")){
		StringBuilder sb = new StringBuilder();
		for (Member membro : guild.getMembersWithRoles(guild.getRoleById("973783051555438612"))) {
			sb.append(membro.getIdLong()).append("\n");
		}
		String[] id2 = new String[sb.length()];
		id2 = sb.toString().split("\n");
		for (int Valores = 0; Valores < id2.length; Valores++) {
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782087331098655")).queue();
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973783051555438612")).queue();
			guild.addRoleToMember(guild.getMemberById(id2[Valores]), guild.getRoleById("974119329643782144")).queue();
			guild.moveVoiceMember(guild.getMemberById(id2[Valores]), geral).complete();
		}
		Comando.jogo--;
		return;}
	if(e.getComponentId().equalsIgnoreCase("Relatar3")){
		StringBuilder sb = new StringBuilder();
		for (Member membro : guild.getMembersWithRoles(guild.getRoleById("973783051555438612"))) {
			sb.append(membro.getIdLong()).append("\n");
		}
		String[] id2 = new String[sb.length()];
		id2 = sb.toString().split("\n");
		for (int Valores = 0; Valores < id2.length; Valores++) {
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782087331098655")).queue();
			guild.removeRoleFromMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973783051555438612")).queue();
			guild.moveVoiceMember(guild.getMemberById(id2[Valores]), geral).complete();
		}
		Comando.jogo--;
		return;	
	}
	if(e.getComponentId().equalsIgnoreCase("Sortear3")){
		a = 0;
		int a = aleatoriar(0,4);
		guild.getTextChannelById("973656005189705758").sendMessage("AO USAR MAPA VOCE RECBE BONUS DE PONTOS +1 \n O mapa da vez é: " + mapas[a]).queue();
		return;
	}
	if(e.getComponentId().equalsIgnoreCase("Sair")){
		guild.removeRoleFromMember(e.getMember(), guild.getRoleById("974327001089466369")).queue();
		Comando.jgr--;
	}
	
	}

	
	
	private static List<Button> enviarBotao(){
		List<Button> botao = new ArrayList<>();
		botao.add(Button.success("EQVENCEU", "Acabou!"));
		botao.add(Button.danger("Relatar", "Houve um problema."));
		botao.add(Button.secondary("Sortear", "Sortear mapa!"));
		return botao;
	}
	private static List<Button> enviarBotao1(){
		List<Button> botao1 = new ArrayList<>();
		botao1.add(Button.success("EQVENCEU1", "Acabou!"));
		botao1.add(Button.danger("Relatar1", "Houve um problema."));
		botao1.add(Button.secondary("Sortear1", "Sortear mapa!"));
		return botao1;
	}
	private static List<Button> enviarBotao2(){
		List<Button> botao2 = new ArrayList<>();
		botao2.add(Button.success("EQVENCEU2", "Acabou!"));
		botao2.add(Button.danger("Relatar2", "Houve um problema."));
		botao2.add(Button.secondary("Sortear2", "Sortear mapa!"));
		return botao2;
	}
	private static List<Button> enviarBotao3(){
		List<Button> botao3 = new ArrayList<>();
		botao3.add(Button.success("EQVENCEU3", "Acabou!"));
		botao3.add(Button.danger("Relatar3", "Houve um problema."));
		botao3.add(Button.secondary("Sortear3", "Sortear mapa!"));
		return botao3;
	}
	
	
	
	 /*/StringBuilder sb2 = new StringBuilder();
	 for (Member membro : guild.getMembersWithRoles(guild.getRoleById("974327001089466369"))) {
		 	sb2.append(membro.getIdLong()).append("\n");
		 }
		 String[] id = new String[sb.length()];
		 id2 = sb2.toString().split("\n");
		for (int Valores2 = 0; Valores2 < 2; Valores2++) {
	 		guild.removeRoleFromMember(e.getMember(), guild.getRoleById("974327001089466369")).queue();
	 		guild.addRoleToMember(guild.getMemberById(id[Valores2]), guild.getRoleById("973782395599847464")).queue();
		 	guild.addRoleToMember(guild.getMemberById(id[Valores2]), guild.getRoleById("973782087331098655")).queue();
			guild.moveVoiceMember(guild.getMemberById(id[Valores2]), voiceChannel2).complete();
		 }/*/
	 // guild.moveVoiceMember(guild.getMemberById(id2[Valores]), voiceChannel).complete();
	//guild.removeRoleFromMember(e.getMember(), guild.getRoleById("974327001089466369")).queue();
	 //	guild.addRoleToMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782395599847464")).queue();
	 	//guild.addRoleToMember(guild.getMemberById(id2[Valores]), guild.getRoleById("973782087331098655")).queue();
}
//e.getGuild().getTextChannelById("973655896045531237").deleteMessages(guild.getTextChannelById("973655896045531237").getHistory().retrievePast(50).complete()).queue();
