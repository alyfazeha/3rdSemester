<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ARRAY 1</title>
</head>
<body>
    <h2>Array Terindeks</h2>
    <?php
        $listDosen=["Elok Nur Hamdana", "Unggul Pamenang", "Bagas Nugraha"];

        echo $listDosen[2] . "<br>";
        echo $listDosen[0] . "<br>";
        echo $listDosen[1] . "<br><br>";

        for ($a = 0; $a < 3; $a++) {
            echo $listDosen[$a] . "<br>";
        }
    ?>
</body>
</html>