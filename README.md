```scala
sbt compile
```

```
[error] ## Exception when compiling 1 sources to ...
[error] java.lang.StackOverflowError
[error] dotty.tools.dotc.core.Types$TypeMap.mapOver(Types.scala:6197)
[error] dotty.tools.dotc.inlines.Inliner$$anon$4.apply$$anonfun$3(Inliner.scala:586)
[error] scala.collection.mutable.HashMap.getOrElse(HashMap.scala:451)
[error] dotty.tools.dotc.inlines.Inliner$$anon$4.apply(Inliner.scala:586)
[error] dotty.tools.dotc.core.Types$TypeMap.mapOver(Types.scala:6203)
[error] dotty.tools.dotc.inlines.Inliner$$anon$4.apply(Inliner.scala:590)
[error] dotty.tools.dotc.core.Types$TypeMap.op$proxy18$1(Types.scala:6199)
[error] dotty.tools.dotc.core.Types$TypeMap.mapOver(Types.scala:6199)
[error] dotty.tools.dotc.inlines.Inliner$$anon$4.apply$$anonfun$4(Inliner.scala:589)
[error] scala.collection.mutable.HashMap.getOrElse(HashMap.scala:451)
[error] dotty.tools.dotc.inlines.Inliner$$anon$4.apply(Inliner.scala:589)
[error] dotty.tools.dotc.inlines.Inliner$$anon$4.apply(Inliner.scala:584)
[error] dotty.tools.dotc.ast.TreeTypeMap.mapType(TreeTypeMap.scala:76)
```