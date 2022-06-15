(ns trials.futureSintaxi)
(println "[Main] calculate the answer to life the universe and everything")

;; Used Thread/sleep to simulate long running process
(def what-is-the-answer-to-life
  (future
    (println "[Future] started computation")
    (Thread/sleep 3000) ;; running for 3 seconds
    (println "[Future] completed computation")
    42))

(println "[Main] created future")

(Thread/sleep 1000)
(println "[Main] do other things while waiting for the answer")
(println "[Main] get the answer")
(println "[Main] the result" @what-is-the-answer-to-life)
(shutdown-agents)