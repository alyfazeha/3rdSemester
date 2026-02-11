<?php
$points = 400;

echo "Player's total score is: $points";
echo "<br>Do players get additional rewards?";
if ($points > 500) {
    echo "YES";
} else {
    echo "NO";
}
?>