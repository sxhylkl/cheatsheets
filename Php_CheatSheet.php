<?php
include 'lib_inc.php';

/*
 * Einfache Arrays mit Ausgabe
 */
$tp = array(
    17.5,
    19.2,
    21.8,
    21.6,
    17.5
);
$tp[6] = 16.6;
$tp[] = 45.7;
$tp[] = (float) 45;
$tp[] = "Bla";

echo "<table border=1><tr>";
foreach ($tp as $i => $wert) {
    echo "<td>$i</td>";
}
echo "</tr>";

for ($i = 0; $i < count($tp); $i ++) {
    echo "<td>$tp[$i]</td>";
}
echo "</table>";

foreach ($tp as $i => $wert) {
    printf("%s -> %s <br />", $i, $wert);
}

/*
 * Assoziative Arrays
 */
$tp = array(
    "Mo" => 17.5,
    "Di" => 19.2,
    "Mi" => 21.8,
    "Do" => 21.6,
    "Fr" => 17.5,
    "Sa" => 20.2
);
$tp["So"] = 16.6;
echo "<p>" . $tp["Mo"] . "</p>";
echo "<table border='1'><tr><td><b>Wochentag</b></td><td><b>Temperatur</b></td></tr>";
foreach ($tp as $name => $wert)
    echo "<tr><td>$name</td><td align='right'>$wert</td></tr>";
echo "</table>";
$summe = 0;
foreach ($tp as $wert)
    $summe = $summe + $wert;
echo "<p>Summe: $summe</p>";

/*
 * Mehrdimensionale Assoziative Arrays (Beispiel mit Tabellenausgabe
 */
$tp[] = array(
    "Hersteller" => "Quantum",
    "Typ" => "Fireball CX",
    "MB" => 6400,
    "Preis" => 215.00,
    "Artikelnummer" => "HDA-208"
);
$tp[] = array(
    "Hersteller" => "Quantum",
    "Typ" => "Fireball Plus",
    "MB" => 9100,
    "Preis" => 269.00,
    "Artikelnummer" => "HDA-163"
);

echo "<table border=1><tbody>";
foreach ($tp as $art => $data) {
    echo "<tr><td>$data[Hersteller]</td><td>$data[Typ]</td><td>$data[MB]</td><td>$data[Preis]</td><td>$data[Artikelnummer]</td></tr>";
}
echo "</table></tbody>";

/*
 * Dateien
 */
$fp = fopen("ug01data.txt", "r");
if ($fp) {
    $zeile = fgets($fp, 100);
    echo fgets($fp, 100) . "<br />"; // liest die erste Zeile
    echo fgets($fp, 100); // liest die zweiteZeile
    while (! feof($fp)) { // komplette Datei Zeile für Zeile
        echo fgets($fp) . "<br />";
    }
    fclose($fp);
} else
    echo "Datei wurde nicht gefunden";

/* Dateien und Array ... weiteres Beispiel, lesen aus Datei: */
$fp = fopen("ug03data.txt", "r");
$dateiinhalt = "";
while (! feof($fp)) {
    $tp[] = array(
        "vorname" => fgets($fp),
        "nachname" => fgets($fp)
    );
}
echo "<table border='1'><tr><th><b>Nummer</b></th>
            <th><b>Vorname</b></th><th><b>Nachname</b></th></tr>";
foreach ($tp as $name => $wert) {
    echo "<tr><td>" . ($name + 1) . "</td><td>" . $wert["vorname"] . "</td>
            <td>" . $wert["nachname"] . "</td></tr>";
}
fclose($fp);
echo "</table>";


/* GET Parameterabfrage --> in Datei Speichern*/
if(isset($_GET['submit'])){ //check if form was submitted
    var_dump($_GET);
	$fpName = fopen("fullname.txt", "w");
	if (FALSE === $fpName) {
	    exit("Konnte Datei $fpName nicht öffnen");
	}
	fwrite($fpName, "".$_GET["vorname"]." ".$_GET["nachname"]." ".$_GET["email"]. PHP_EOL);
	fclose($fpName);
}    


/* 
 * Cookies 
 */
bool setcookie ( string $name [, string $value [, int $expire = 0 [, string $path [, string $domain [, bool $secure = false [, bool $httponly = false ]]]]]] )
$value = 'irgendetwas von irgendwo';
setcookie("TestCookie", $value, time()+3600);  /* verfällt in 1 Stunde */

// ein bestimmtes Cookie ausgeben
echo $_COOKIE["TestCookie"];
echo $HTTP_COOKIE_VARS["TestCookie"];

// Ein anderer Weg zu Debuggen/Testen ist, alle Cookies anzuzeigen
print_r($_COOKIE);

/* Cookie Setzen und gleich abfragen (site reload) */
if(isset($_GET['submit'])){ //check if form was submitted
    setcookie("lieblingsfarbe", $_GET["lieblingsfarbe"]);
    header('Location: '.$_SERVER['PHP_SELF']); // site reload
}
if (isset($_COOKIE["lieblingsfarbe"])){
    echo "Aktuell gesetztes Cookie: ".$_COOKIE["lieblingsfarbe"]."<br /><br />";
}


?>
