(ns trials.promiseSintaxi)

(defn promise-example
  []
  (let [p (promise)
        t1 (Thread. (fn []
                      (dotimes [n 5]
                        (Thread/sleep 100)
                        (print (str "T1: " @p "\n"))
                        (flush))))
        t2 (Thread. (fn []
                      (dotimes [n 5]
                        (Thread/sleep 50)
                        (print (str "T2: " (deref p 50 :timeout) "\n"))
                        (flush))))]
    (.start t1)
    (.start t2)
    (println (realized? p))
    (Thread/sleep 300)
    (deliver p 42)
    (println (realized? p))
    (.join t1)
    (.join t2)
    :done))

(promise-example)