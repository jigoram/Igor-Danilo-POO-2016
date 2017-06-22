
<!DOCTYPE html>
<html>
<head>

<style>



div.container {
    width: 100%;
   border: 1px solid gray;
}

header, footer{
    padding: 1em;
    color: white;
    background-color: #000000;
    clear: left;
    text-align: center;
}
header
{
	padding-bottom: 0em;
}
nav {
    float: left;
    max-width: 160px;
    margin: 0;
    padding: 0.5em;
}

nav ul {
    list-style-type: none;
    padding: 0;
}
   
nav ul a {
    text-decoration: none;
}

article {
    margin-left: 170px;
	border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
nav ul {
	margin: 0;
	padding: 0;
	list-style: none;
	width: 150px;
	}
nav ul li {
	position: relative;
	}
nav li ul {
	position: absolute;
	left: 149px;
	top: 0;
	display: none;
	}
nav ul li a {
	display: block;
	text-decoration: none;
	color: #777;
	background: #fff;
	padding: 5px;
	border: 1px solid #ccc;
	border-bottom: 0;
	}
nav ul {
	margin: 0;
	padding: 0;
	list-style: none;
	width: 150px;
	border-bottom: 1px solid #ccc;
}
</style>


<meta charset="utf-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>

<div class="container">

<header>
   <h1>Registro</h1>
   
   
<?php
$now = new DateTime(null, new DateTimeZone('America/Maceio'));
echo '<h4 align="right">' . $now->format('H:i:s');
?> 

</header>
  
<nav>
  <ul>
	<li><a href="main.php">Página Inicial</a></li>
    <li><a href="/cadastrar2.php">Cadastrar</a></li>
    <li><a href="/ver_registro.php">Ver Registro</a></li>
	<li><a href="https://servicos.sds.pe.gov.br/portalsds/">Portal SDS</a></li>
  </ul>
</nav>

<article>


<head>


<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>

</head>
<body>

<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "funcionario";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT nome, cpf, setor, email FROM funcionarioexp";
$result = $conn->query($sql);
	echo " <table> <tr>
    <th>Nome</th>
    <th>CPF</th>
    <th>Setor</th>
	<th>E-mail</th>
  </tr>";
if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
		echo "
  <tr>
    <td>" . $row["nome"]. "</td>
    <td>" . $row["cpf"]. "</td>
    <td>" . $row["setor"]. "</td>
	<td>" . $row["email"]. "</td>
  </tr>
";
    }
} else {
    echo "";
}
$conn->close();
?>



</article>

<footer></footer>

</div>

</body>
</html>



