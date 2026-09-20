# ODE_02 — Recap II
[ODE_02_MW](https://github.com/Abon-Obscurum/ODE_02_MW)

Solutions for the exercises of Einheit 02 (Objektorientierte Entwicklung, FH Technikum Wien). Builds on the shape hierarchy from Recap I.

Requires Java 17 and IntelliJ IDEA.

## Running

The project has four `main()` methods, one per exercise. Pick the right one in the run configuration:

| Exercise | Main class |
|---|---|
| Klassenhierarchie, Collection, Entry Zugriff | `form.Main` |
| Laufzeit Problem | `laufzeit.Main` |
| Klasse Rechteck | `form.RechteckMain` |
| Exception Handling | `division.Main` |

## Contents

**form** — `Form` is now an abstract class instead of an interface, as required by the assignment, and declares the abstract `info()`. It also holds two `protected` helpers, `flaecheAlsHex()` and `gerundet()`, so the subclasses stay free of duplicated code.

**Kreis, Quadrat, GlDreieck** — taken over from Recap I. `info()` returns a String now instead of printing, in the format `(Klassenname): (interne Var), (Fläche), (Fläche int in HEX), (Umfang)`. Units were dropped from the output since the format does not ask for them.

**Rechteck** — new shape, extends `Form`. Uses `double` because its values come from user input. Its `info()` prints both internal vars as `laengexbreite`.

**form.Main** — six shapes, two per class, one from the no-arg constructor and one with parameters. They go into a `TreeMap<Double, Form>` keyed by area, which sorts them from small to big on its own. `lastEntry()` returns the biggest shape in a single line without a loop. Downside: equal areas would overwrite each other, which the chosen values avoid.

**form.RechteckMain** — reads length and width from the console. The original swapped the two values and had no error handling: `Double.parseDouble` throws a `NumberFormatException` on input like `abc` or `2,5`, since only the dot works as a decimal separator. The input is now repeated until it is valid, `0` and negative values are rejected, and `scan.close()` moved to the end because it closes `System.in` for good.

**laufzeit** — parses `"10"`, `"20"` and `"30"` in every base from 10 down to 2. Two problems in the given code: the inner loop ran to index 3 while the array only goes up to 2, which is fixed in the loop condition rather than caught, since an off-by-one is a bug and not an exceptional case. The `NumberFormatException` is caught, because whether a string is valid depends on the base at runtime — `"20"` does not exist in base 2, `"30"` neither in base 2 nor 3. The try-catch sits inside the inner loop so one bad value does not skip the remaining bases.

**division** — `performDivision()` lives in its own class so `Main` only holds the test cases and the error output. Three custom checked exceptions extend `Exception`: `DivisionByZeroException`, `NegativeDividendException` and `DivisionException`, the last one keeping the original exception as its cause. The divisor is checked before dividing, otherwise Java's own `ArithmeticException` would fire first. In `Main` the specific catch blocks come before the general one, since the other way round the compiler rejects them as unreachable.

## Author
Moritz Wieser,
ODE Einheit 02, SS 2026