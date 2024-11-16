public class Bulbasaur extends Pokemon implements IPlanta{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur, ataque placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur, ataque arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur, ataque mordisco!");
    }

    @Override
    public void atacarDrenar() {
        System.out.println("Bulbasaur, ataque drenaje!");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur, ataque Paralizar!");
    }
    
}
