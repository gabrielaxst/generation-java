package fundamentosPOO.produto;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("RPG", "DELL", "XBOX Series S",
                "Naruto", "Hinata");
        System.out.println(produto1.visualizar());
        System.out.println();

        Produto produto2 = new Produto("Gacha", "Samsung", "PS5",
                "Itachi", "Kakashi");
        System.out.println(produto2.visualizar());
        System.out.println();
    }
}
