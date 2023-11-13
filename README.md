# Notes on Strings

A string is a group of characters.  They are 
locatable via an index.  The first character is located
at spot 0.

```java
String s = "Lubbock";
```
```
Lubbock
0123456
```
Method | Use
-------|-------
charAt(x) | the char at spot x
length() | the amount of chars
substring(x,y) |a section of the original starting at spot x and going up to but not including spot y
substring(x) | a section of the original from x to the end
indexOf(str) | the location of String str in the original string looking from spot 0
indexOf(ch) |  "    "   "  char ch 
lastIndexOf(str) | looks from the end of the string and looks towards the front
lastIndexOf(ch) |  "      "    "  " 
equals(str) |  boolean and returns true if they match, false otherwise
compareTo(str) | int difference between the first different chars we are comparing


