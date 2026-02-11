<?php
$price = 120000;

if ($price > 10000) {
    $price -= ($price * 0.2);
}

echo "The price to be paid after getting the discount : $price";
?>