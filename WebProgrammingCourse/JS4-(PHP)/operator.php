<?php
$a = 10;
$b = 5;

$hasilTambah = $a + $b;
$hasilKurang = $a - $b;
$hasilKali = $a * $b;
$hasilBagi = $a / $b;
$sisaBagi = $a % $b;
$pangkat = $a ** $b;

echo "Nilai a         : {$a} <br>";
echo "Nilai b         : {$b} <br><br>";

echo "Hasil Tambah    : {$hasilTambah} <br>";
echo "Hasil Kurang    : {$hasilKurang} <br>";
echo "Hasil Kali      : {$hasilKali} <br>";
echo "Hasil Bagi      : {$hasilBagi} <br>";
echo "Sisa Bagi       : {$sisaBagi} <br>";
echo "Pangkat         : {$pangkat} <br>";

$hasilSama = $a == $b;
$hasilTidakSama = $a != $b;
$hasilLebihKecil = $a < $b;
$hasilLebihBesar = $a > $b;
$hasilLebihKecilSama = $a <= $b;
$hasilLebihbesarSama = $a >= $b;

echo "Nilai a                : {$a} <br>";
echo "Nilai b                : {$b} <br><br>";

echo "Apakah a sama dengan b?            : "; var_dump($hasilSama); echo "<br>";
echo "Apakah a tidak sama dengan b?      : "; var_dump($hasilTidakSama); echo "<br>";
echo "Apakah a lebih kecil dari b?       : "; var_dump($hasilLebihKecil); echo "<br>";
echo "Apakah a lebih besar dari b?       : "; var_dump($hasilLebihBesar); echo "<br>";
echo "Apakah a lebih kecil atau sama b?  : "; var_dump($hasilLebihKecilSama); echo "<br>";
echo "Apakah a lebih besar atau sama b?  : "; var_dump($hasilLebihBesarSama); echo "<br>";

$hasilAnd = $a && $b;
$hasilOr = $a || $b;
$hasilNotA = !$a;
$hasilNotB = !$b;

echo "<br>";
echo "Hasil a AND b : "; var_dump($hasilAnd); echo "<br>";
echo "Hasil a OR b  : "; var_dump($hasilOr); echo "<br>";
echo "Hasil NOT a   : "; var_dump($hasilNotA); echo "<br>";
echo "Hasil NOT b   : "; var_dump($hasilNotB); echo "<br>";

echo "<br>";
echo "Nilai awal a : {$a} <br>";
echo "Nilai awal b : {$b} <br><br>";

$a += $b; 
echo "Setelah a += b : {$a} <br>";
$a -= $b; 
echo "Setelah a -= b : {$a} <br>";
$a *= $b; 
echo "Setelah a *= b : {$a} <br>";
$a /= $b; 
echo "Setelah a /= b : {$a} <br>";
$a %= $b; 
echo "Setelah a %= b : {$a} <br>";

$hasilIdentik = $a === $b;
$hasilTidakIdentik = $a !== $b;

echo "<br>";
echo "Nilai a : "; var_dump($a); echo "<br>";
echo "Nilai b : "; var_dump($b); echo "<br><br>";

echo "Apakah a identik dengan b?     : "; var_dump($hasilIdentik); echo "<br>";
echo "Apakah a tidak identik dengan b? : "; var_dump($hasilTidakIdentik); echo "<br>";
?>