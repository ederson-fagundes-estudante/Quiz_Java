import java.util.Scanner;
public class Quiz {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void print(String text) {
        System.out.println(text);
    }

    public static String scan(String text) {
        print(text);
        return sc.next();
    }
    
    public static int scanInt(String text) {
        print(text);
        return sc.nextInt();
    }
    
    public static int menu(String[] options, String ask) {
        String text = ask+"\n\n";
        
        for(int x = 0; options.length>x; x++) {
            text += (x+1)+" - "+options[x]+"\n";
        }
        print(text);
        
        return scanInt("Resposta:");
    }
    public static void main(String[] args) {

    	int pontuação = 0;
    	
    	String[] perg = {
    			"Qual desses itens de Cs:Go é mais caro: (Adesivo brilhante Fallen Boston 2018?",
    			"Qual picareta dessas não quebra ouro?",
    			"Qual a altura do Steve do Minecraft?",
    			"Qual desses personagens tem a seguinte fala \"BARRIL!\"?",
    			"Qual desses personagens não utiliza armas?",
    			"Qual desses jogos também é da Nintendo?",
    			"Qual bloco é sem som para o warden?",
    			"Qual o bloco anti-explosão?",
    			"Qual o placar que se tem todos os dias em jogos de fps?",
    			"O ____ é o inventario de Cs:Go mais caro do Brasil"
    	};

        String[] resp = {
        		"Adesivo brilhante Fallen Boston 2018", "Ak Azul Laminado MW", "M4A4 Rei Dragão MW", "Glock-18 Elemental de Água MW",
        		"Ouro", "Diamante", "Ferro", "Netherita",
        		"1,80", "1,60", "1,90", "2,00",
        		"GP", "Lux", "Ziggs", "Ash",
        		"Ashley (RE4)", "Kratos(GOW)", "Steve(Mine)", "Leon (RE4)",
        		"Hades", "Minecraft", "Just Dance", "Sonic",
        		"Bloco de lã", "Bloco de Feno", "Bloco de Ferro", "Bloco de minério",
        		"Command Block", "Diamante", "Bloco de lã", "Cerca",
        		"7x1", "3x4", "7x2", "16x16",
        		"Gaules", "Lugin", "Neymar", "Fallen"
        };

        int[] cert = {
        			1,1,1,1,1,1,1,1,1,1
        		};
        
        for(int i = 0; i<perg.length; i++) {
        	
        	int x = i*4;
        	
        	String[] respostas = {
        		resp[x], 
        		resp[x+1],
        		resp[x+2],
        		resp[x+3]
        	};
        	int y = 0;
        	int respostaRecebida;
        	do {
        		print("Tentativa n° "+(y+1));
        		respostaRecebida = menu(respostas, perg[i]);
        		if(respostaRecebida == cert[i]) break;
        		y++;
        	}while( y<3);
        	
        	if(y==3) print("Errou 3 vezes");
        	else if(y!=0) {
        			pontuação += 3-y;
        			if(y == 1) print("Você errou "+y+" vez");
        			else print("Você errou "+y+" vezes");
        		}
        	
        }
        print("Pontuação final: "+pontuação);
    }

}