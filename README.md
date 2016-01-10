[![travis-ci.org](https://travis-ci.org/bsvingen/clojure.counter.svg?branch=master)](https://travis-ci.org/bsvingen/clojure.counter)

# clojure.counter

Leiningen coordinate:

```clj
[com.borkdal/clojure.counter "0.1.0"]
```

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

