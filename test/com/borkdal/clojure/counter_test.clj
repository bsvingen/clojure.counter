(ns com.borkdal.clojure.counter-test
  (:require [midje.sweet :refer :all]
            [com.borkdal.clojure.counter :refer :all]))

(fact "Printing odds"
  (with-out-str
    (let [counter (make-counter odd? println)]
      (tick counter)
      (tick counter)
      (tick counter)
      (tick counter)
      (tick counter)
      (await (:counter-agent counter))))
  => "1\n3\n5\n")

