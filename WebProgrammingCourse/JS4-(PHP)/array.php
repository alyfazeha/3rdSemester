<?php
$nilaiSiswa = [85, 92, 78, 64, 90, 55, 88, 79, 70, 96];

$nilaiLulus = [];

foreach ($nilaiSiswa as $nilai) {
    if ($nilai >= 70) {
        $nilaiLulus[] = $nilai;
    }
}

echo "Daftar nilai siswa yang lulus : " . implode(', ', $nilaiLulus);

$daftarKaryawan = [
    ['Alice', 7],
    ['Bob', 3],
    ['Charlie', 9],
    ['David', 5],
    ['Eva', 6],
];

$karyawanPengalamanLimaTahun = [];

foreach ($daftarKaryawan as $karyawan) {
    if ($karyawan[1] > 5) {
        $karyawanPengalamanLimaTahun[] = $karyawan[0];
    }
}

echo "<br>Daftar karyawan dengan pengalaman kerja lebih dari 5 tahun : " . implode(', ', $karyawanPengalamanLimaTahun);

$daftarNilai = [
    'Matematika' => [
        ['Alice', 85],
        ['Bob', 92],
        ['Charlie', 78],
    ],
    'Fisika' => [
        ['Alice', 90],
        ['Bob', 88],
        ['Charlie', 75],
    ],
    'Kimia' => [
        ['Alice', 92],
        ['Bob', 80],
        ['Charlie', 85],
    ],
];

$matakuliah = 'Fisika';

echo "<br>Daftar nilai mahasiswa dalam mata kuliah $matakuliah : <br>";

foreach ($daftarNilai[$matakuliah] as $nilai) {
    echo "Nama : {$nilai[0]}, Nilai {$nilai[1]} <br>";
}

$daftarNilai2 = [
        ['Alice', 85],
        ['Bob', 92],
        ['Charlie', 78],
        ['David', 64],
        ['Eva', 90],
];

$i = 0;
$n = 0;
foreach ($daftarNilai2 as $nl) {
    $sum += $nl[1];
    $i++;
    $n++;
};
$average = $sum / $n;

echo "<br>Student who achive grades above the class averange ($average) : ";
$a = 0;
foreach ($daftarNilai2 as $nilai) {
    if ($nilai[1] > $average) {
        echo "<br>Nama : {$nilai[0]}, Nilai {$nilai[1]}";
    }
    $a++;
};
?>