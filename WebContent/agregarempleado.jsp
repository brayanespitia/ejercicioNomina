<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="utf-8">
    <title>Nomina</title>



</head>
<!--  estilos css-->
<link rel="stylesheet" type="text/css" href="css/styles.css">



<body>


    <section id="global">

        <!-- cabecera-->
        <header>
            <div id="logo">
                <h1> Nomina </h1>
            </div>

            <div class="clearfix"></div>
            <nav id="menu">
                <ul>
                    <li> <a href="index.html"> inicio</a></li>


                    <li> <a href="regstro.html"> registro</a></li>
                    <li><a href="busqueda.html"> buscar empleado</a></li>

                </ul>
            </nav>
        </header>


        <section id="content"></section>
        <div id="box">

            <!-- formulario-->
            <h2>Datos empleado</h2>


            <form action="" method="POST" id="form_contact">
                <label for="codigo">Codigo</label>
                <input type="text" data-validation="alphanumeric" name="name">
                <br>
                <label for="name">nombre</label>
                <input type="text" data-validation="alphanumeric" name="name">
                <br>
                <label for="apellido"> apellido</label>
                <input type="text" data-validation="alphanumeric" name="apellido">

<br>

                <label for="date"> fecha de nacimiento</label>
                <input type="text" data-validation="date" data-validation-format="dd-mm-yyyy" name="date">
                <br>
                <label for="date"> fecha de ingreso</label>
                <input type="text" data-validation="date" data-validation-format="dd-mm-yyyy" name="date">
                <br>
                <label for="date"> fecha de retiro</label>
                <input type="text" data-validation="date" data-validation-format="dd-mm-yyyy" name="date">
                <br>
                <input type="submit" value="enviar">


            </form>


        </div>

        <div class="clearfix"></div>
    </section>

    <footer>
        todos los derechos reservados


        <a href="#" class="subir"> ir arriba</a>
    </footer>
</body>

</html>