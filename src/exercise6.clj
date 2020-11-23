(ns exercise6)

(defn faverage
  "Calculates the average of a given sequence."
  [x]
  (/ (reduce + x) (count x))
;;  (println (count x))
;;  (println (sum x))
;;  (println x)
)




