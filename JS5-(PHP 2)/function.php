<?php
function perkenalan($nama, $salam="Assalamu'alaikum") {
    echo $salam . ", ";
    echo "Perkenalkan, nama saya " . $nama . "<br/>";
    echo "Senang berkenalan denga Anda<br/>";
}

perkenalan("Hamdana", "Hallo");
echo "<hr>";

$saya = "Elok";
$ucapanSalam = "Selamat pagi";

perkenalan($saya);
?>