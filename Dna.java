public class Dna{
    public static void main(String[] args){
                String dna1 = "ATGCGATACGCTTGA";
                String dna2 = "ATGCGATACGTGA";
                String dna3 = "ATTAATATGTACTGA";
        
                String dna = dna3;
        
                int codonInicioIndex = dna.indexOf("ATG");
                int codonParadaIndex = dna.indexOf("TGA", codonInicioIndex + 3);
                int dnaLength = dna.length();
        
                if (codonInicioIndex != -1 && codonParadaIndex != -1 && (codonParadaIndex - codonInicioIndex) % 3 == 0) {
                    String proteina = dna.substring(codonInicioIndex, codonParadaIndex + 3);
                    System.out.println("Contém uma proteína: " + proteina);
                } else {
                    System.out.println("Sem proteína");
                }
                System.out.println(dna.indexOf("ATG"));
            }
        }
        

        