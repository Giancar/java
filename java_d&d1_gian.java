import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    Random gerador = new Random();

	    int vidaD = 50;
	    int vida = 50;
	    
	    int atk1 = 5;
	    int atk2 = 10;
	    int atk3 = 15;
	    int atkD = 7;
	    
	    int def = 13;
	    int defD = 10;
	    
	    int op;
	    int chance;
	    int chanceDef;
	    
        while (vida != 0 | vidaD != 0){
    		System.out.println("Vida do Dragão : " + vidaD);
    		System.out.println("Def do Dragão : "+ defD);
    		System.out.println("-------------------------");
    		System.out.println("Sua vida : " + vida);
    		System.out.println("Sua Def : " + def);
    		System.out.println("-------------------------");
    		System.out.println("Escolhas seu Ataque");
    		System.out.print("1 - Flechada (90/100 de chance): " + atk1 + "\n");
    		System.out.print("2 - Espadada (75/100 de chance): " + atk2 + "\n");
    		System.out.print("3 - Lançada (55/100 de chance): "+ atk3 + "\n");
    		System.out.println("-------------------------");
    		op = scan.nextInt();
    		
    		if(op == 1){
    		    chance = gerador.nextInt(99);
    		    
    		    if(chance >= 10){
    		        chanceDef = gerador.nextInt(19);
    		        if(chanceDef >= 10){
        		        System.out.println("Você acertou a Flechada!");
        		        System.out.println("-------------------------");
        		        vidaD = vidaD - atk1;
        		    }
    		    }else{
    		        System.out.println("Você errou a Flechada!");
    		        System.out.println("-------------------------");
    		    }
    		}else if(op == 2){
    		    chance = gerador.nextInt(99);
    		
    		    if(chance >= 25){
    		        chanceDef = gerador.nextInt(19);
    		        if(chanceDef >= 10){
    		            System.out.println("Você acertou a Espadada!");
    		            System.out.println("-------------------------");
    		            vidaD = vidaD - atk2;
    		        }
    		    }else{
    		        System.out.println("Você errou a Espadada!");
    		        System.out.println("-------------------------");
    		    }
    		}else if(op == 3){
    		    chance = gerador.nextInt(99);
    		
    		    if(chance >= 45){
    		        chanceDef = gerador.nextInt(19);
    		        if(chanceDef >= 10){
        		        System.out.println("Você acertou a Lançada!");
        		        System.out.println("-------------------------");
        		        vidaD = vidaD - atk3;
    		        }
    		    }else{
    		        System.out.println("Você errou a Lançada!");
    		        System.out.println("-------------------------");

    		    }
    		}else{
    		    System.out.println("Opção Inválida!");
    		    System.out.println("-------------------------");
    		}
    		System.out.println("-------------------------");
    		System.out.println("Vez do Dragão");
    		System.out.println("Dragão lança rajada de fogo(7 de dano)!");
    		System.out.println("-------------------------");
    		chance = gerador.nextInt(99);
    		if(chance >= 35){
    		    chanceDef = gerador.nextInt(19);
    		    if(chanceDef >= 13){
    		        System.out.println("O Dragão te acertou!");
    		        System.out.println("-------------------------");
    		        vida = vida - atkD;
    		    }
    		}else{
    		    System.out.println("O Dragão errou!");
    		    System.out.println("-------------------------");
    		}
    	    System.out.println("-------------------------");
    	    
            	if(vida <= 0){
            	    System.out.println("Você Foi morto pelo Dragão!!!");
            	    System.out.println("-------------------------");
            	    break;
            	}
            	if(vidaD <= 0){
            	    System.out.println("Você matou o Dragão!!");
            	    System.out.println("-------------------------");
            	    break;
            	}    
        }
	
	}
	
}
