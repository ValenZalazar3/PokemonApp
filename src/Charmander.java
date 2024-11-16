public class Charmander extends Pokemon implements IFuego{
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander, ataque placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander, ataque arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander, ataque mordisco!");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander, ataque puño de fuego!");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charmander, ataque lanza llamas!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander, ataque ascuas!");
    }
    
}
