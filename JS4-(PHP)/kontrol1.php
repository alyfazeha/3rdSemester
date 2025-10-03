<?php
$nilaiSiswa = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];
$max = $nilaiSiswa[0];
$min = $nilaiSiswa[0];
for ($i=0; $i <10 ; $i++) { 
    if ($max < $nilaiSiswa[$i]) {
        $max = $nilaiSiswa[$i];
    }
    if ($min > $nilaiSiswa[$i]) {
        $min = $nilaiSiswa[$i];
    }
};
$max2 = $min; 
$min2 = $max; 
for ($i = 0; $i < 10; $i++) { 
    if ($nilaiSiswa[$i] != $max && $nilaiSiswa[$i] > $max2) {
        $max2 = $nilaiSiswa[$i];
    }
    if ($nilaiSiswa[$i] != $min && $nilaiSiswa[$i] < $min2) {
        $min2 = $nilaiSiswa[$i];
    }
}
$n = 0;
for ($i = 0; $i < 10; $i++) { 
    if ($nilaiSiswa[$i] != $max && $nilaiSiswa[$i] != $max2 
        && $nilaiSiswa[$i] != $min && $nilaiSiswa[$i] != $min2) {
        $sum += $nilaiSiswa[$i];
        $n++;
    }
}
$average = $sum / $n;
echo "<br>Maximum 1 : $max";
echo "<br>Maximum 2 : $max2";
echo "<br>Minimum 1 : $min";
echo "<br>Minimum 1 : $min2";
echo "<br><br>Total grades after ignore the two highest grades and the two lowest grades : $sum";
echo "<br>Average : $average";
?>