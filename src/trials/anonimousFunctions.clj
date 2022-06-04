(ns trials.anonimousFunctions)

(defn way-one []
  (println "This is one way to create anonymous functions")
  (println "Result of add 2 and 5 = " ((fn [x y] (+ x y)) 2 5)))

(way-one)

(defn way-two []
  (println "This is the second way to create anonymous functions")
  (println "Result of add 2 and 5 = " ( #(+ %1 %2) 2 5)))

(way-two)