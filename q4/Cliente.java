package q4;

public class Cliente {
  public static void main(String[] args) {
    Sanduiche sanduicheCG = new SanduicheCG();
    System.out.println("Sanduíche CG Normal: " + sanduicheCG.ingredientes());

    Sanduiche gourmetCG = new SanduicheGourmet(sanduicheCG);
    System.out.println("Sanduíche CG Gourmet: " + gourmetCG.ingredientes());

    Sanduiche veganoCG = new SanduicheVegano(sanduicheCG);
    System.out.println("Sanduíche CG Vegano: " + veganoCG.ingredientes());

    Sanduiche sanduicheJP = new SanduicheJP();
    System.out.println("\nSanduíche JP Normal: " + sanduicheJP.ingredientes());

    Sanduiche gourmetJP = new SanduicheGourmet(sanduicheJP);
    System.out.println("Sanduíche JP Gourmet: " + gourmetJP.ingredientes());

    Sanduiche veganoJP = new SanduicheVegano(sanduicheJP);
    System.out.println("Sanduíche JP Vegano: " + veganoJP.ingredientes());

    Sanduiche sanduicheRT = new SanduicheRT();
    System.out.println("\nSanduíche RT Normal: " + sanduicheRT.ingredientes());

    Sanduiche gourmetRT = new SanduicheGourmet(sanduicheRT);
    System.out.println("Sanduíche RT Gourmet: " + gourmetRT.ingredientes());

    Sanduiche veganoRT = new SanduicheVegano(sanduicheRT);
    System.out.println("Sanduíche RT Vegano: " + veganoRT.ingredientes());
  }
}
