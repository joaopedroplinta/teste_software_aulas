package src.personagens;

public class Gnomo implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        personagem.setInteligencia(personagem.getInteligencia() + 2);
    }
}
