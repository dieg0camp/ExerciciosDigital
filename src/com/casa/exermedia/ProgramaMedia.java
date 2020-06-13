package com.casa.exermedia;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float altf = 0;  //media altura final
        float a1;       //
        int contf = 0;

        float maior2 = 0;
        float maior1 = 0;
        float maior = 0;

        float menor1 = 0;
        float menor2 = 0;
        float menor = 99999;

        float altm = 0;
        float a2;
        float contm = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("1. MASCULINO       2.FEMININO    0.SAIR \n\n");
            System.out.print("ESCOLHA:");
            int n = t.nextInt();
             switch (n) {
                    case 0:
                        System.out.println("Saindo 2"); // sem funcionar

                        break;

                    case 1:
                        System.out.println("Qual a sua altura?");
                        a1 = t.nextFloat();
                        altm += a1;
                        contm++;

                        if (a1 > maior1) {
                            maior1 = a1;
                        }
                        if (a1 < menor1) {
                            menor1 = a1;
                        }
                        break;
                    case 2:
                        System.out.println("Qual a sua altura? ");
                        a2 = t.nextFloat();
                        altf += a2;
                        contf++;
                        if (a2 > maior2) {
                            maior2 = a2;
                        }
                        if (a2 < menor2) {
                            menor2 = a2;
                        }

                        break;


                    default:
                        System.out.println("Opção inválida.");
                }
            }
            if (maior1 > maior2) {
                maior = maior1;
            } else {
                maior = maior2;
            }
            if (menor1 < menor2) {
                menor = menor1;
            } else {
                menor = menor2;
            }
            float f = altf / contf; //média feminino
            float m = altm / contm; //média masculino
            float mediaT = (altf + altm) / 5; //media total

            System.out.println("Média da altura das mulheres: " + f);
            System.out.println("Média altura dos homens: " + m);
            System.out.println("Média da altura da turma: " + mediaT);
            System.out.println("maior da turma: " + maior);
            System.out.println("Menor da turma: " + menor);
        }
    }
