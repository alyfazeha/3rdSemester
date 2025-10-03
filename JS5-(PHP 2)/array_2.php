<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ARRAY 2</title>
</head>
<body>
    <?php
        $dosen = [
            'nama' => 'Elok Nur Hamdana',
            'domisili' => 'Malang',
            'jenis_kelamin' => 'Perempuan'
        ];
    ?>
    <table border= 1 height="100%" width="40%">
            <tr>
                <td>Nama</td>
                <td><?php echo $dosen ['nama'] ?></td>
            </tr>
            <tr>
                <td>Domisili</td>
                <td><?php echo $dosen ['domisili'] ?></td>
            </tr>
            <tr>
                <td>Jenis Kelamin</td>
                <td><?php echo $dosen ['jenis_kelamin'] ?></td>
            </tr>
    </table>
</body>
</html>