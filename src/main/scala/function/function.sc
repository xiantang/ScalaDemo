var increase = (x :Int) => x+1

increase(1)

var more = 1

val addMore = (x :Int) => x+more

addMore(10)
def makeincreaser(more: Int) = (x: Int) => x + more
val inc9999 = makeincreaser(999)
inc9999(10)