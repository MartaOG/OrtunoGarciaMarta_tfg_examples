(ns trials.multiThreadingExamples)

(def keep-running? (volatile! true))

;FAILS
(def threadA (doto (Thread. (fn []
                              (Thread/sleep 10000)
                              (vreset! keep-running? false)))
               (.start)))

(def threadB (doto (Thread. (fn []
                              (while @keep-running?
                                (Thread/sleep 1000)
                                (println "Still running!"))))
               (.start)))
(defn main []
  (threadA))
(main)