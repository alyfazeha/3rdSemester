<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  $name = htmlspecialchars($_POST['name']);
  $email = htmlspecialchars($_POST['email']);
  $ticket = htmlspecialchars($_POST['ticket']);
  $quantity = htmlspecialchars($_POST['quantity']);

  $uploadDir = "uploads/";
  if (!is_dir($uploadDir)) {
    mkdir($uploadDir);
  }
  $fileName = $_FILES["payment"]["name"];
  $tempName = $_FILES["payment"]["tmp_name"];
  $targetFile = $uploadDir . basename($fileName);
  move_uploaded_file($tempName, $targetFile);
} else {
  echo "<h2>No data received.</h2>";
  exit;
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Registration Confirmation</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <div class="overlay"></div>

  <div class="container">
    <div class="form-card">
        <img src="assets/logo.png" alt="LANY Logo" class="logo">
      <h1>LANY LIVE IN CONCERT</h1>
      <p>Register now and secure your spot for the night you’ll never forget 🌙</p>

      <h2>✨ Registration Successful ✨</h2>
      <p>See you at the concert! Here are your registration details:</p>

      <div class="summary">
        <p><strong>Name:</strong> <?= $name ?></p>
        <p><strong>Email:</strong> <?= $email ?></p>
        <p><strong>Ticket Type:</strong> <?= $ticket ?></p>
        <p><strong>Quantity:</strong> <?= $quantity ?></p>
        <p><strong>Payment Proof:</strong> <?= $fileName ?></p>
      </div>

      <a href="index.html" class="btn back-btn">← Back to Form</a>
    </div>
  </div>

  <script src="script.js"></script>
</body>
</html>
