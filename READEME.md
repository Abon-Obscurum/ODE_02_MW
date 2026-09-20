# ODE_02 — Recap II
[ODE_02_MW](https://github.com/Abon-Obscurum/ODE_02_MW)

Solutions for the exercises of Einheit 02 (Objektorientierte Entwicklung, FH Technikum Wien). Builds on the shape hierarchy from Recap I.

Requires Java 17 and IntelliJ IDEA.

## Running

The project has two `main()` methods. Pick the right one in the run configuration:

| Exercise | Main class |
|---|---|
| Collection, Entry Zugriff | `form.Main` |
| Klasse Rechteck | `form.RechteckMain` |

Laufzeit Problem and Exception Handling are not implemented yet.

## Contents

**form** — `Form` is now an abstract class instead of an interface, as required by the assignment, and declares the abstract `info()`. It also holds two `protected` helpers, `flaecheAlsHex()` and `gerundet()`, so the subclasses stay free of duplicated code.

**Kreis, Quadrat, GlDreieck** — taken over from Recap I. `info()` returns a String now instead of printing, in the format `(Klassenname): (interne Var), (Fläche), (Fläche int in HEX), (Umfang)`. Units were dropped from the output since the format does not ask for them.

**Rechteck** — new shape, extends `Form`. Uses `double` because its values come from user input. Its `info()` prints both internal vars as `laengexbreite`.

**Main** — six shapes, two per class, one from the no-arg constructor and one with parameters. They go into a `TreeMap<Double, Form>` keyed by area, which sorts them from small to big on its own. `lastEntry()` returns the biggest shape in a single line without a loop. Downside: equal areas would overwrite each other, which the chosen values avoid.

**RechteckMain** — reads length and width from the console. The original swapped the two values and had no error handling: `Double.parseDouble` throws a `NumberFormatException` on input like `abc` or `2,5`, since only the dot works as a decimal separator. The input is now repeated until it is valid, `0` and negative values are rejected, and `scan.close()` moved to the end because it closes `System.in` for good.

## Author
Moritz Wieser,
ODE Einheit 02, SS 2026