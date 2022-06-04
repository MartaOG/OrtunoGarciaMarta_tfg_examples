(ns trials.partialApplicationFunctions)

(defn say-your-name [article noun verb name]
  (str article " " noun " " verb " " name))

(defn ask-for-someone [adverb verb name symbol]
  (str adverb " " verb " " name symbol))

(defn write-your-name [name]
  ;(say-your-name "my" "name" "is" name)
  (ask-for-someone "where" "is" name "?"))

(println "Execution of write-your-parameter function: " (write-your-name "Marta"))
