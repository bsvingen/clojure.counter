# clojure.counter

This is a simple Clojure library for counting things, and invoking side-effects at counts qualifying a provided predicate.

For instance, if you want to print a message every 100 counts, do something like this:

```clojure
(def c (make-counter #(= 0 (mod % 100))
					 #(println "We have now counted to" %)))
```

Then call

```clojure
(tick c)
```

to increase the counter by one.

