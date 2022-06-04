(ns trials.highOrderFunctions)

(defn cube [num]
  (* num num num))

(defn cube-all [numbers]
  (if (empty? numbers)
    ()
    (cons (cube (first numbers))
          (cube-all (rest numbers)))))

(println "Execution of cube all with parameter: 1 2 3 4 5 6: " (cube-all [1 2 3 4 5 6]))