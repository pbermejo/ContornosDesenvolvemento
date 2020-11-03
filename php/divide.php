<?php
echo "Introduce el primer número entero: ";
$a = stream_get_line(STDIN, 1024, PHP_EOL);
echo "Introduce el segundo número entero: ";
$b = stream_get_line(STDIN, 1024, PHP_EOL);

echo("El resultado de la división es " . ($a / $b));
?>