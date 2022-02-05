package lldite

object Uzdevumi1Listi {
  // (List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12), List(1, 2, 4, 5, 7, 8, 10, 11))
  def filterNumbersDivisibleBy3(l: List[Int]): List[Int] =
    l.filter(x => x % 3 != 0)

  // (('a' to 'z').toList, List('c', 'f', 'i', 'l', 'o', 'r', 'u', 'x')),
  def everyThirdLetter(l: List[Char]): List[Char] =
    l.zipWithIndex.filter(x => x._2 % 3 == 2).map(x => x._1)

  // (0, "zero, divisible by 3, divisible by 5"),
  // (1, ""),
  // (-1, "negative"),
  // (-3, "negative, divisible by 3"),
  // (5, "divisible by 5"),
  // (30, "divisible by 3, divisible by 5"),
  def numberPatterns(x: Int): String =
    if (x == 0) "zero, divisible by 3, divisible by 5"
    else (
      if (x % 3 == 0 && x % 5 == 0 && x < 0) "negative, divisible by 3, divisible by 5"
      else (
        if (x % 3 == 0 && x % 5 == 0) "divisible by 3, divisible by 5"
        else (
          if (x % 3 == 0 && x < 0) "negative, divisible by 3"
          else (
            if (x % 3 == 0) "divisible by 3"
            else (
              if (x % 5 == 0 && x < 0) "negative, divisible by 5"
              else (
                if (x % 5 == 0) "divisible by 5"
                else (
                  if (x == 1 && x < 0) "negative"
                  else (
                    if (x == 1) " "
                    else (
                      if (x < 0) "negative"
                      else "else")))))))))

  // (List(0), 0),
  // (List(1, 0, 1), 0),
  // (List(2, 2, 0), 0),
  // (List(-2, -1, 0), -2),
  def getElementAtMaxIndex(list: List[Int]): Int = ???

  // (List(0, 0, 0), "..."),
  // (List(1, 1), "::"),
  // (List(9, 8, 7, 6, 5), "#%|:."),
  // (List(0, 1, 2, 3, 4, 5, 6, 7, 8), "#%|:."),
  // (List(0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4), "...:::|||%%%###"),
  def fillPattern(list: List[Int]): String = ???
}
