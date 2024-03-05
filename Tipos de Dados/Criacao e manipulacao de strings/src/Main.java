public class Main {
    public static void main(String[] args) {
        /*
        STRING SÃO IMUTÁVEIS PQ SÃO OBJETOS
        O METÓDO TOUPPERCASE CRIA UM NOVO OBJETO COM A STRING PASSADA E DEVOLVE UMA REFERÊNCIA PRO OBJETO
        s = s.toUpperCase() garante que seja atualizada a referência pro objeto com o novo valor
        METÓDOS DE STRING NÃO ALTERAM O VALOR DA STRING, ELES DEVOLVEM UMA NOVA REFERÊNCIA PRO OBJETO STRING COM A STRING MODIFICADA
         */

        String texto = "pretendo fazer a prova de certificação de java";
        System.out.println(texto.indexOf("prova")); // procura a primeira posição onde o conteúdo passado está no texto da String.
        System.out.println(texto.lastIndexOf("de")); // procura a primeira posição onde o conteúdo passado está no texto da String.

        System.out.println(texto.startsWith("pre"));
        System.out.println(texto.endsWith("va"));

        System.out.println("Java".equals("java")); //COMPARA 2 STRINGS USANDO O CASE-SENSITIVE, RETORNA TRUE SE FOREM IGUAIS E FALSE SE FOREM DIFERENTES
        System.out.println("Java".equalsIgnoreCase("java"));// COMPARA 2 STRINGS IGNORANDO O CASE-SENSITIVE, RETORNA TRUE SE FOREM IGUAIS E FALSE SE FOREM DIFERENTES

        System.out.println("Certificado".compareTo("Arnaldo")); // COMPARETO RETORNA POSITIVO SE A STRING COMPARADA VEM DEPOIS, RETORNA 0 SE FOREM IGUAIS E RETORNA NEGATIVO SE VIER ANTES. LETRAS MAIÚSCULAS VEM PRIMEIRO QUE LETRAS MINÚSCULAS
        System.out.println("Certificado".compareTo("Certificado"));
        System.out.println("Certificado".compareTo("Grécia"));
        System.out.println("Certificado".compareTo("certificado"));
        System.out.println("Certificado".compareToIgnoreCase("certificado"));

        String java = "Java";
        System.out.println(java.substring(1)); // SUBSTRING USA O INDEX DOS CARACTERES PARA RECORTAR A STRING
        System.out.println(java.substring(0, 4));
        System.out.println(java.substring(0, 3));

        String parseado = "   Quero tirar uma certificação oficial java!   ".toUpperCase().trim();
        System.out.println(parseado);

        String m = "mateus";
        m = m.toUpperCase();
        System.out.println(m);

        System.out.println(m.charAt(0));
        System.out.println(m.length());
        System.out.println("".isEmpty());
        System.out.println("mateus".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println(" mateus ".trim());
        System.out.println(m.replace('A', 'I'));// REPLACE MUDANDO CARACTERES
        System.out.println(m.replace("EUS", "XXX")); // REPLACE MUDANDO STRINGS

        String nomeDireto = "Java";
        String nomeIndireto = new String("Java");
        char[] nome = new char[]{'j', 'a', 'v', 'a'};
        String nome1 = new String(nome);
        StringBuilder sb1 = new StringBuilder("java");
        String nome2 = new String(sb1);

        String nomeNulo = null;
        String nomeDaProva = "Certificação" +" "+"Java";
        String nomeDaProvaComNulo = nomeDaProva + " "+nomeNulo;
        System.out.println(nomeDaProva);
        System.out.println(nomeDaProvaComNulo);

        System.out.println(1500+" Certificação " + 1500);
    }
}
