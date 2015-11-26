(ns com.borkdal.clojure.counter)

(defrecord Counter
    [counter-agent
     pred
     f])

(defn make-counter
  [pred
   f]
  (->Counter (agent 0) pred f))

(defn tick
  [counter]
  {:pre [(instance? Counter counter)]}
  (letfn [(do-count
            [count]
            (let [new-count (inc count)]
              (if ((:pred counter) new-count)
                ((:f counter) new-count))
              new-count))]
    (send-off (:counter-agent counter) do-count)
    nil))

