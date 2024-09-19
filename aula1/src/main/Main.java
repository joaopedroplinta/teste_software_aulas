package src.main;
import src.personagens.Anao;
import src.personagens.ClasseDistribuicaoPontos27;
import src.personagens.DistribuicaoPontos;
import src.personagens.Elfo;
import src.personagens.Gnomo;
import src.personagens.Halfling;
import src.personagens.Humano;
import src.personagens.Personagem;
import src.personagens.Raca;

public class Main {
    public static void main(String[] args) {
        DistribuicaoPontos distribuicao = new ClasseDistribuicaoPontos27();
        Raca humano = new Humano();
        Raca anao = new Anao();
        Raca elfo = new Elfo();
        Raca gnomo = new Gnomo();
        Raca halfling = new Halfling();

        Personagem personagem1 = new Personagem("Bruenor", distribuicao, humano);
        Personagem personagem2 = new Personagem("Drizzt", distribuicao, anao);
        Personagem personagem3 = new Personagem("Catti-brie", distribuicao, elfo);
        Personagem personagem4 = new Personagem("Wulfgar", distribuicao, gnomo);
        Personagem personagem5 = new Personagem("Regis", distribuicao, halfling);

        System.out.println("Personagem 1: " + personagem1.getNome());
        System.out.println("Força: " + personagem1.getForca());
        System.out.println("Destreza: " + personagem1.getDestreza());
        System.out.println("Constituição: " + personagem1.getConstituicao());
        System.out.println("Inteligência: " + personagem1.getInteligencia());
        System.out.println("Sabedoria: " + personagem1.getSabedoria());
        System.out.println("Carisma: " + personagem1.getCarisma());
        System.out.println("Pontos de Vida: " + personagem1.getPontosDeVida());

        System.out.println("\nPersonagem 2: " + personagem2.getNome());
        System.out.println("Força: " + personagem2.getForca());
        System.out.println("Destreza: " + personagem2.getDestreza());
        System.out.println("Constituição: " + personagem2.getConstituicao());
        System.out.println("Inteligência: " + personagem2.getInteligencia());
        System.out.println("Sabedoria: " + personagem2.getSabedoria());
        System.out.println("Carisma: " + personagem2.getCarisma());
        System.out.println("Pontos de Vida: " + personagem2.getPontosDeVida());

        System.out.println("\nPersonagem 3: " + personagem3.getNome());
        System.out.println("Força: " + personagem3.getForca());
        System.out.println("Destreza: " + personagem3.getDestreza());
        System.out.println("Constituição: " + personagem3.getConstituicao());
        System.out.println("Inteligência: " + personagem3.getInteligencia());
        System.out.println("Sabedoria: " + personagem3.getSabedoria());
        System.out.println("Carisma: " + personagem3.getCarisma());
        System.out.println("Pontos de Vida: " + personagem3.getPontosDeVida());
        
        System.out.println("\nPersonagem 4: " + personagem4.getNome());
        System.out.println("Força: " + personagem4.getForca());
        System.out.println("Destreza: " + personagem4.getDestreza());
        System.out.println("Constituição: " + personagem4.getConstituicao());
        System.out.println("Inteligência: " + personagem4.getInteligencia());
        System.out.println("Sabedoria: " + personagem4.getSabedoria());
        System.out.println("Carisma: " + personagem4.getCarisma());
        System.out.println("Pontos de Vida: " + personagem4.getPontosDeVida());

        System.out.println("\nPersonagem 5: " + personagem5.getNome());
        System.out.println("Força: " + personagem5.getForca());
        System.out.println("Destreza: " + personagem5.getDestreza());
        System.out.println("Constituição: " + personagem5.getConstituicao());
        System.out.println("Inteligência: " + personagem5.getInteligencia());
        System.out.println("Sabedoria: " + personagem5.getSabedoria());
        System.out.println("Carisma: " + personagem5.getCarisma());
        System.out.println("Pontos de Vida: " + personagem5.getPontosDeVida());
    }
}
