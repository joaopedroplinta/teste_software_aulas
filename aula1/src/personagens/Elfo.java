package src.personagens;

public class Elfo implements Raca  {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        personagem.setDestreza(personagem.getDestreza() + 2);
    }
}
