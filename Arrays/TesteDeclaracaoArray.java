class A{
    public static void main( String[] args ) {
        int x[] = new int[30];
        int y[] = new int[3]{1,2,3};
    }
}

//Arrays/TesteDeclaracaoArray.java:4: error: array creation with both dimension expression and initialization is illegal
//        int y[] = new int[3]{1,2,3};
//                            ^
//1 error

//A linha 4 linha não compila pois, ou você passa o tamanho, ou passa os valores.