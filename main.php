
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
   <h1>Secretaria de Defesa Social - EC - 07 Tarde</h1>
   

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
Bem vindo ao setor da Secretaria de Defesa Social do Expresso Cidadão Garanhuns (Fone: 3761-8674) <br>
Jose Igor de Araujo Melo



</article>

<footer>igor-sugar@hotmail.com</footer>

</div>

</body>
</html>
