package ArranjoTeste;

public class ArranjoCod {

	static class Arranjo {
        private Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};

        public int menor() {
            int menor = a[0];
            for (int num : a) {
                if (num < menor) {
                    menor = num;
                }
            }
            return menor;
        }

        public int maior() {
            int maior = a[0];
            for (int num : a) {
                if (num > maior) {
                    maior = num;
                }
            }
            return maior;
        }

        public int soma() {
            int soma = 0;
            for (int num : a) {
                soma += num;
            }
            return soma;
        }

        public int repeticoes(int valor) {
            int count = 0;
            for (int num : a) {
                if (num == valor) {
                    count++;
                }
            }
            return count;
        }
    }

}
