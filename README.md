# Kata Time Take 3: `String` Theory
This week's katas are all `String` based.  They will require use of the `java.lang.String` API's methods to come up with solutions.  Take some time to think out a few test cases before starting each kata.  Then start writing unit test.

---

## Translating Names
### The Challenge
Test-drive a method that will accept a camel-cased name either `beginningWithALowercaseCharacter` or `WithAnUppercaseOne`, and produce a snake-cased version of that name, like `beginning_with_a_lowercase_character` or `with_an_uppercase_one`.
### Sample Tests
- `StuffHappens` >> `stuff_happens`
- `stringsAreFunForEveryone` >> `strings_are_fun_for_everyone`

---

## Word Wrap
### The Challenge
Test-drive a method to accept a string and a line length, and return a version of the original string, possibly with newline characters inserted, such that no line in the resulting string is longer than the supplied line length.

Wherever possible, newlines should be inserted between words; they should be placed inside words only when those words are themselves longer than the permitted line length.

If there is a space at the beginning of a new line, it should be ignored.

### Notes
- Assume that the input will contain only spaces to separate words: no tabs, no newlines, no form feeds; and hyphens, commas, periods, etc. are considered to be part of the words they're embedded in.
- Assume that words will be separated by only one space: no multiple consecutive spaces.

### Sample Tests
- `wordWrap(8, "The cat jumped over the moon")` returns:
> The cat

> jumped

> over the

> moon
- `wordWrap(4, "The cat jumped over the moon")` returns:
> The

> cat

> jump

> ed

> over

> the

> moon

- `wordWrap(8, "Delicious food is good")` returns:
> Deliciou

> s food 

> is good

- `wordWrap(3, "The cat smells bad")` returns:
> The

> cat

> sme

> lls

> bad