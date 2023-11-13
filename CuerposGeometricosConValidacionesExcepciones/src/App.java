
	import java.util.Scanner;

	public class App
	{
	    public static void main(String[] args) throws Exception
	    {
	        Scanner xd = new Scanner(System.in);
	        int Contador = 0;
	        
	        for(int i = 0; i < 3; i++)
	        {
	            int op = 0;
	            
	            while (true) 
	            {
	            	System.out.println("1- PRISMA");
		            System.out.println("2- CILINDRO");
		            System.out.println("3- PIRAMIDE");
		            System.out.println("4- CONO");
		            System.out.println("5- ESFERA");
		            System.out.println("6- ZONA ESFERICA");
		            System.out.println("7- TRONCO DE CONO");
		            System.out.println("8- TRONCO DE PIRAMIDE");
		            System.out.println("9- ORTOEDRO");
		            System.out.println("10- TETRAEDRO");
		            System.out.println("11- HEXAEDRO");
		            System.out.println("12- OCTAEDRO");
		            System.out.println("13- DODECAEDRO");
		            System.out.println("14- ICOSAEDRO");
		            System.out.println("15- HUSO ESFERICO Y CU\u00D1A ESFERICA");
		            System.out.println("16- CASQUETE ESFERICO");
		            System.out.println("17. SALIR");
		            
	                String input = xd.nextLine();

	                try 
	                {
	                    op = Integer.parseInt(input);

	                    if (op >= 1 && op <= 17)
	                        break;
	                    else 
	                        System.out.println("La opcion ingresada no es valida. Intentalo de nuevo.");
	                    
	                } 
	                catch (NumberFormatException e) 
	                {
	                    System.out.println("Debes ingresar un numero valido (1-17).");
	                }
	            }// Cierre de While
	            
	                switch (op)
	                {
	                    case 1: ProblemaPrisma(); break;
	                    
	                    case 2: ProblemaCilindro(); break;
	                    
	                    case 3: ProblemaPiramide(); break;
	                    
	                    case 4: ProblemaCono(); break;
	                    
	                    case 5: ProblemaEsfera(); break;
	                    
	                    case 6: ProblemaZonaEsferica(); break;
	                    
	                    case 7: ProblemaTroncoDeCono(); break;
	                    
	                    case 8: ProblemaTroncoDePiramide(); break;
	                    
	                    case 9: ProblemaOrtoedro(); break;
	                    
	                    case 10: ProblemaTetraedro(); break;
	                    
	                    case 11: ProblemaHexaedro(); break;
	                    
	                    case 12: ProblemaOctaedro(); break;
	                    
	                    case 13: ProblemaDodecaedro(); break;
	                    
	                    case 14: ProblemaIcosaedro(); break;
	                    
	                    case 15: ProblemaHusoEsfericoYCuñaEsferica(); break;
	                    
	                    case 16: ProblemaCasqueteEsferico(); break;
	                    
	                    case 17: CerraPrograma(); break;
	                    
	                } // SWITCH
	        } // FOR
	    } // MAIN
	    
        /*1*/public static void ProblemaPrisma() 
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR PRISMA........");

	        int CantLad1 = obtenerEnteroPositivo(xd, "Ingrese la cantidad de lados de su Prisma: ");
	        double LongLad1 = obtenerDoublePositivo(xd, "Ingrese la longitud de lados de su Prisma: ");
	        double alt1 = obtenerDoublePositivo(xd, "Ingrese la altura de su Prisma: ");

	        double PerBase1 = CantLad1 * LongLad1;
	        double ArLat1 = PerBase1 * alt1;
	        double Af1 = ((Math.PI / 180) * (380 / CantLad1));
	        double Apo1 = LongLad1 / (2 * Math.tan((Af1) / 2));
	        double ArBas1 = ((PerBase1 * Apo1) / 2);
	        double ArTot1 = (ArLat1 + (2 * ArBas1));
	        double V1 = (ArBas1 * alt1);

	        System.out.println("==================================================");
	        System.out.println("El Area Lateral de su figura Prisma es : " + ArLat1);
	        System.out.println("El Area Total de su figura Prisma es : " + ArTot1);
	        System.out.println("El Volumen de su figura Prisma es : " + V1);
	        System.out.println("==================================================");
	    }

   /*2*/public static void ProblemaCilindro() 
   {
       Scanner xd = new Scanner(System.in);
       System.out.println("........BIENVENIDO A SU CALCULADOR CILINDRO........");

       double Rad1 = obtenerDoublePositivo(xd, "Ingrese el radio de su Cilindro: ");
       double alt2 = obtenerDoublePositivo(xd, "Ingrese la altura de su Cilindro: ");

       double PerBase2 = (2 * Math.PI * Rad1);
       double ArLat2 = PerBase2 * alt2;
       double ArBas2 = (Math.PI * Math.pow(Rad1, 2));
       double ArTot2 = (ArLat2 + (2 * ArBas2));
       double V2 = (ArBas2 * alt2);

       System.out.println("==================================================");
       System.out.println("El Area Lateral de su figura Cilindro es: " + ArLat2);
       System.out.println("El Area Total de su figura Cilindro es: " + ArTot2);
       System.out.println("El Volumen de su figura Cilindro es: " + V2);
       System.out.println("==================================================");
   }

   /*3*/public static void ProblemaPiramide() 
   {
       Scanner xd = new Scanner(System.in);
       System.out.println("........BIENVENIDO A SU CALCULADOR PIRAMIDE........");

       double alt3 = obtenerDoublePositivo(xd, "Ingrese la altura de su Piramide: ");
       double LongLads3 = obtenerDoublePositivo(xd, "Ingrese la longitud de lados de su Piramide: ");
       double AnchLads3 = obtenerDoublePositivo(xd, "Ingrese la anchura de los lados de su Piramide: ");

       double PerBase3 = (2 * LongLads3 + 2 * AnchLads3);
       double Apo3 = LongLads3 / 2;
       double ArPir3 = Math.sqrt(Math.pow(alt3, 2) + Math.pow(Apo3, 2));
       double ArLat3 = ((PerBase3 * ArPir3) / 2);
       double ArTot3 = (ArLat3 + PerBase3);
       double ArBas3 = LongLads3 / 2;
       double V3 = ((ArBas3 * alt3) / 3);

       System.out.println("==================================================");
       System.out.println("El Area Lateral de su figura Piramide es: " + ArLat3);
       System.out.println("El Area Total de su figura Piramide es: " + ArTot3);
       System.out.println("El Volumen de su figura Piramide es: " + V3);
       System.out.println("==================================================");
   }

   /*4*/public static void ProblemaCono() 
   {
       Scanner xd = new Scanner(System.in);
       System.out.println("........BIENVENIDO A SU CALCULADOR CONO........");

       double alt4 = obtenerDoublePositivo(xd, "Ingrese la altura de su Cono: ");
       double Rad2 = obtenerDoublePositivo(xd, "Ingrese el radio de su Cono: ");

       double Gen1 = Math.sqrt(Math.pow(alt4, 2) + Math.pow(Rad2, 2));
       double ArLat4 = (Math.PI * (Rad2 * Gen1));
       double ArBas4 = (Math.PI * (Rad2 * Rad2));
       double ArTot4 = (ArLat4 + ArBas4);
       double V4 = ((ArBas4 + ArLat4) / 3);

       System.out.println("==================================================");
       System.out.println("El Area Lateral de su Cono es: " + ArLat4);
       System.out.println("El Area Total de su Cono es: " + ArTot4);
       System.out.println("El Volumen de su Cono es: " + V4);
       System.out.println("==================================================");
   }


   /*5*/public static void ProblemaEsfera() 
   {
       Scanner xd = new Scanner(System.in);
       System.out.println("........BIENVENIDO A SU CALCULADOR ESFERA........");

       double Rad3 = obtenerDoublePositivo(xd, "Ingrese el radio de su Esfera: ");

       double Ar = (4 * Math.PI * Math.pow(Rad3, 2));
       double V5 = ((4.0 / 3) * Math.PI * Math.pow(Rad3, 3));

       System.out.println("==================================================");
       System.out.println("El Area de su Esfera es: " + Ar);
       System.out.println("El Volumen de su Esfera es: " + V5);
       System.out.println("==================================================");
   } 


        /*6*/public static void ProblemaZonaEsferica()
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR ZONA ESFERICA........");
	        System.out.println("Ingrese el radio de su Zona Esferica : ");
	        double Rad6 = xd.nextDouble();   
	        System.out.println("Ingrese la altura de su Zona Esferica : ");
	        double alt6 = xd.nextDouble();   
	        System.out.println("Ingrese el radio mayor de su Zona Esferica : ");
	        double RadMyr6 = xd.nextDouble();   
	        double area = (2*Math.PI*RadMyr6*alt6);
	        double volumen = ((Math.PI*alt6*(Math.pow(alt6,2)+3*Math.pow(Rad6,2)+3*Math.pow(RadMyr6, 2)))/6);
	        System.out.println("==================================================");
	        System.out.println("El Area de su Zona Esferica es : " + area);
	        System.out.println("El Volumen de su Zona Esferica es : " + volumen);
	        System.out.println("==================================================");
	    } 

   /*7*/public static void ProblemaTroncoDeCono() 
   {
       Scanner xd = new Scanner(System.in);
       System.out.println("........BIENVENIDO A SU CALCULADOR TRONCO DE CONO........");

       double alt7 = obtenerDoublePositivo(xd, "Ingrese la altura de su Tronco de Cono: ");
       double RadMen7 = obtenerDoublePositivo(xd, "Ingrese el radio menor de su Tronco de Cono: ");
       double RadMay7 = obtenerDoublePositivo(xd, "Ingrese el radio mayor de su Tronco de Cono: ");

       double Gen7 = Math.sqrt(Math.pow(alt7, 2) + Math.pow(RadMay7 - RadMen7, 2));
       double ArBasM7 = (Math.PI * Math.pow(RadMay7, 2));
       double ArBaseMenr7 = (Math.PI * Math.pow(RadMen7, 2));
       double ArLat7 = (Math.PI * Gen7 * (RadMay7 + RadMen7));
       double ArTot7 = (ArLat7 + (ArBasM7 + ArBaseMenr7));
       double V7 = ((1.0 / 3) * Math.PI * alt7 * (Math.pow(RadMay7, 2) + Math.pow(RadMen7, 2) + (RadMay7 * RadMen7)));

       System.out.println("==================================================");
       System.out.println("El Area Lateral de su Tronco de Cono es: " + ArLat7);
       System.out.println("El Area Total de su Tronco de Cono es: " + ArTot7);
       System.out.println("El Volumen de su Tronco de Cono es: " + V7);
       System.out.println("==================================================");
   }

	    /*8*/public static void ProblemaTroncoDePiramide() 
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR TRONCO DE PIRAMIDE........");

	        double LongMyr = obtenerDoublePositivo(xd, "Ingrese la longitud del lado mayor de su Tronco de Piramide: ");
	        double LongMnr = obtenerDoublePositivo(xd, "Ingrese la longitud del lado menor de su Tronco de Piramide: ");
	        double alt8 = obtenerDoublePositivo(xd, "Ingrese la altura de su Tronco de Piramide: ");

	        double LongMyrMitd8 = (LongMyr / 2);
	        double ApPi8 = Math.sqrt(Math.pow(alt8, 2) + Math.pow(LongMyrMitd8, 2));
	        double ArBas8 = Math.pow(LongMyr, 2);
	        double Arbas8 = Math.pow(LongMnr, 2);
	        double PerBase8 = (LongMyr * 4);
	        double Perbase8 = (LongMnr * 4);
	        double ArLat8 = (((PerBase8 + Perbase8) / 2) * ApPi8);
	        double ArTot8 = ((ArLat8 + ArBas8) + ArBas8);
	        double V8 = ((1.0 / 3) * alt8 * (ArBas8 + ArBas8 + Math.sqrt(ArBas8 * ArBas8)));

	        System.out.println("==================================================");
	        System.out.println("El Area Lateral de su Tronco de Piramide es: " + ArLat8);
	        System.out.println("El Area Total de su Tronco de Piramide es: " + ArTot8);
	        System.out.println("El Volumen de su Tronco de Piramide es: " + V8);
	        System.out.println("==================================================");
	    }

	    /*9*/public static void ProblemaOrtoedro() 
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR ORTOEDRO........");

	        double alt9 = obtenerDoublePositivo(xd, "Ingrese la altura de su Ortoedro: ");
	        double bas9 = obtenerDoublePositivo(xd, "Ingrese la base de su Ortoedro: ");
	        double Aris9 = obtenerDoublePositivo(xd, "Ingrese la arista de su Ortoedro: ");

	        double Ar9 = 2 * (Aris9 * bas9 + Aris9 * alt9 + bas9 * alt9);
	        double Diag9 = Math.sqrt(Math.pow(Aris9, 2) + Math.pow(bas9, 2) + Math.pow(alt9, 2));
	        double V9 = Aris9 * bas9 * alt9;

	        System.out.println("==================================================");
	        System.out.println("El Area de su Ortoedro es: " + Ar9);
	        System.out.println("La Diagonal de su Ortoedro es: " + Diag9);
	        System.out.println("El Volumen de su Ortoedro es: " + V9);
	        System.out.println("==================================================");
	    }

	    /*10*/public static void ProblemaTetraedro() 
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR TETRAEDRO........");

	        double Ar10 = obtenerDoublePositivo(xd, "Ingrese la arista de su Tetraedro: ");
	        double Are = Math.pow(Ar10, 3) * Math.sqrt(3);
	        double V10 = ((Math.sqrt(2) / 12) * Ar10);
	        double alt10 = (Ar10 * (Math.sqrt(6) / 3));

	        System.out.println("==================================================");
	        System.out.println("El Area de su Tetraedro es: " + Are);
	        System.out.println("El Volumen de su Tetraedro es: " + V10);
	        System.out.println("La Altura de su Tetraedro es: " + alt10);
	        System.out.println("==================================================");
	    }

	    /*11*/public static void ProblemaHexaedro() 
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR HEXAEDRO........");

	        double Aris11 = obtenerDoublePositivo(xd, "Ingrese la arista de su Hexaedro: ");
	        double Ar11 = (6 * Math.pow(Aris11, 2));
	        double Dig11 = (Aris11 * Math.sqrt(3));
	        double V11 = Math.pow(Aris11, 3);

	        System.out.println("==================================================");
	        System.out.println("El Area de su Hexaedro es: " + Ar11);
	        System.out.println("La Diagonal de su Hexaedro es: " + Dig11);
	        System.out.println("El Volumen de su Hexaedro es: " + V11);
	        System.out.println("==================================================");
	    }

	    /*12*/public static void ProblemaOctaedro() 
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR OCTAEDRO........");

	        double Aris12 = obtenerDoublePositivo(xd, "Ingrese la arista de su Octaedro: ");
	        double Ar12 = (2 * Math.pow(Aris12, 2) * Math.sqrt(3));
	        double V12 = (Math.sqrt(2) / 3) * Math.pow(Aris12, 3);

	        System.out.println("==================================================");
	        System.out.println("El Area de su Octaedro es: " + Ar12);
	        System.out.println("El Volumen de su Octaedro es: " + V12);
	        System.out.println("==================================================");
	    }

	    /*13*/public static void ProblemaDodecaedro() 
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR DODECAEDRO........");

	        double Aris13 = obtenerDoublePositivo(xd, "Ingrese la arista de su Dodecaedro: ");
	        double Ar13 = (3 * Math.pow(Aris13, 2) * Math.sqrt(25 + 10 + Math.sqrt(5)));
	        double V13 = (1 / 4) * (15 + 7 * Math.sqrt(5)) * Math.pow(Aris13, 3);

	        System.out.println("==================================================");
	        System.out.println("El Area de su Dodecaedro es: " + Ar13);
	        System.out.println("El Volumen de su Dodecaedro es: " + V13);
	        System.out.println("==================================================");
	    }

	    /*14*/public static void ProblemaIcosaedro() 
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR ICOSAEDRO........");

	        double Aris14 = obtenerDoublePositivo(xd, "Ingrese la arista de su Icosaedro: ");
	        double Ar14 = 5 * Math.pow(Aris14, 2) * Math.sqrt(3);
	        double V14 = (5 / 12) * (3 + Math.sqrt(5)) * Math.pow(Aris14, 3);

	        System.out.println("==================================================");
	        System.out.println("El Area de su Icosaedro es: " + Ar14);
	        System.out.println("El Volumen de su Icosaedro es: " + V14);
	        System.out.println("==================================================");
	    }

	    /*15*/public static void ProblemaHusoEsfericoYCuñaEsferica() 
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR HUSO ESFERICO Y CUÑA ESFERICA........");

	        double Rad15 = obtenerDoublePositivo(xd, "Ingrese el radio de su Huso Esferico y Cuña Esferica: ");
	        double NrGrd15 = obtenerDoublePositivo(xd, "Ingrese el numero de grados de su Huso Esferico y Cuña Esferica: ");
	        double Ar15 = ((4 * Math.PI * Math.pow(Rad15, 2) * NrGrd15) / 360);
	        double V15 = (((4 / 3) * 4 * Math.pow(Math.PI, 3) * NrGrd15) / 360);

	        System.out.println("==================================================");
	        System.out.println("El Area de su Huso Esferico y Cuña Esferica es: " + Ar15);
	        System.out.println("El Volumen de su Huso Esferico y Cuña Esferica es: " + V15);
	        System.out.println("==================================================");
	    }

	    /*16*/public static void ProblemaCasqueteEsferico() 
	    {
	        Scanner xd = new Scanner(System.in);
	        System.out.println("........BIENVENIDO A SU CALCULADOR CASQUETE ESFERICO........");

	        double alt16 = obtenerDoublePositivo(xd, "Ingrese la altura de su Casquete Esferico: ");
	        double RadMay16 = obtenerDoublePositivo(xd, "Ingrese el radio mayor de su Casquete Esferico: ");
	        double Ar16 = (2 * Math.PI * RadMay16 * alt16);
	        double V16 = ((Math.PI * Math.pow(alt16, 2) * (3 * RadMay16 - alt16)) / 6);

	        System.out.println("==================================================");
	        System.out.println("El Area de su Casquete Esferico es: " + Ar16);
	        System.out.println("El Volumen de su Casquete Esferico es: " + V16);
	        System.out.println("==================================================");
	    }

	    public static void CerraPrograma()
	    {
	        int Contador = 0;
	        if(Contador == 17)
	        {
	            Scanner xd = new Scanner(System.in);
	            System.out.println("==================================================");
	            System.out.println("....SALIENDO DEL PROGRAMA....");
	            System.out.println("==================================================");
	            System.exit(0);
	            xd.close();
	        }
	    }
	    
	    public static int obtenerEnteroPositivo(Scanner xd, String mensaje)
	    {
	    	int numero = 0;

	        do {
	            System.out.print(mensaje);

	            if (xd.hasNextInt()) {
	                numero = xd.nextInt();

	                if (numero >= 1) {
	                    break; // Salir del bucle si es un entero positivo
	                } else {
	                    System.out.println("Ingrese un número entero positivo.");
	                }
	            } else {
	                System.out.println("Ingrese un número entero válido.");
	                xd.next();
	            }
	        } while (true);

	        return numero;
	    }// Cierre de validacion Entero y negativo
	    
	    public static double obtenerDoublePositivo(Scanner xd, String mensaje) 
	    {
	        double numero = 0.0;
	        boolean entradaValida = false;

	        while (!entradaValida) 
	        {
	            System.out.print(mensaje);

	            if (xd.hasNextDouble()) 
	            {
	                numero = xd.nextDouble();
	                
	                if (numero >= 0.0) 
	                {
	                    entradaValida = true;
	                } else 
	                {
	                    System.out.println("Ingrese un número double positivo.");
	                }

	                if (numero < 0.0)
	                {
	                    System.out.println("El número no puede ser negativo.");
	                    entradaValida = false;
	                }
	            } else 
	            {
	                System.out.println("Ingrese un número double válido.");
	                xd.next();
	            }
	        }

	        return numero;
	    }// Cierre del metodo Double y negativo
	}// Cierre de la clase

