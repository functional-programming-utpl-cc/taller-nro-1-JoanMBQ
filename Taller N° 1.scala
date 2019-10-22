//1) 2) 3) 4)
val countries = List("Ecuador", "Venezuela", "Colombia", "Perú", "Chile", "Argentina", "Uruguay", "Paraguay", "Brasil")
countries.filter(_.contains("C"))
countries.filter(x => x.contains("E") || x.contains("e"))
countries.filter(x => x.contains("E") || x.contains("l"))
countries.filter(x => x.length > 5)
//5)
val numbers = List(10, 11, 12, 18, 20, 50, 60, 80, 81, 96)
val NoAbundante = (num: Int) => (1 until num).filter(num % _ == 0).sum<num
numbers.filter(NoAbundante)