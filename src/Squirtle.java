public class Squirtle extends Pokemon implements IAgua{
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle, ataque placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle, ataque arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle, ataque mordisco!");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Squirtle, ataque hidro bomba!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle, ataque burbuja!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle, ataque pistola de agua!");
    }
    
}
