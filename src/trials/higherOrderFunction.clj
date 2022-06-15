(ns trials.higherOrderFunction)

(defn double-of [f a b]
  (* 2 (f a b)))

(println "First result of double-of call: " (double-of + 2 3))
(println "Second result of double-of call: " (double-of * 2 3))
(println "Third result of double-of call: " (double-of - 2 3))
