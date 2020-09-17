(ns challenge)

(defn stairClimb
  [n]
  (if (= n 0)
    0
    (loop [prev (bigint 1)
           curr (bigint 1)
           count 1]
      (if (= n count)
        curr
        (recur curr (+ curr prev) (inc count))))))
