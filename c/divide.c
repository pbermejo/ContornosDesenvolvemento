#include <stdio.h>
#include <stdlib.h>
int main(){
	int a, b;
	printf("Introduce el primer numero entero: ");
	scanf("%d", &a);
	printf("Introduce el segundo numero entero: ");
	scanf("%d", &b);
	printf("\nEl resultado de la division es %d", a / b);
	printf("\n");
	system("pause");
	return 0;
}