(ns unclogged.core
  (:import
   [com.cloudbees.syslog Facility])
  (:gen-class))

(defn ^:private facility
  [x]
  (cond
    (string? x) (Facility/fromLabel x)
    (number? x) (Facility/fromNumericalCode x)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
