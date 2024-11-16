public class Pikachu extends Pokemon implements IElectrico{
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu, ataque placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu, ataque arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu, ataque mordisco!");
    }

    @Override
    public void atacarImpactTrueno() {
        System.out.println("Bulbasaur, ataque impact trueno!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Bulbasaur, ataque puño trueno!");
    }
    
}
