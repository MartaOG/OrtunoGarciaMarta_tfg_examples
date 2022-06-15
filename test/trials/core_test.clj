(ns trials.core-test
  (:require [clojure.test :refer :all]
            [trials.cube_examples :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest cube-all-test
  (def number (cube-all [1 2 3 4 5 6]))
  (def expect [1 8 27 64 125 216])
  (testing (if (= number expect))))
