(ns exercise9)
(require '[clojure.string :as s])

(defn word-count 
  "Returns a map where each key is a distinct word in a given sentence and each value is the number of occurences of that word in the sentence."
  [x]
  (frequencies (s/split (s/lower-case x) #"\W+"))
)




