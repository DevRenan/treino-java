class A{
    public static void main( String[] args ) {
        int x[] = new int[0];
        int x[] = new int[] {0,3,5};
        int x[] = {0,3,5};
    }
}

//Arrays/TesteDeclaracaoArray2.java:4: error: variable x is already defined in method main(String[])
//        int x[] = new int[] {0,3,5};
//            ^


//O programa não compila pois a segunda e a terceira linha tentam redefinir uma variável já definida.
// Caso o nome da variável seja corrigido, o código compila e imprime nada ao rodar (um array pode ter tamanho zero).