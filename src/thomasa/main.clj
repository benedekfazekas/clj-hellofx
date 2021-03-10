(ns thomasa.main
  (:import [thomasa HelloFX])
  (:gen-class
   :name thomasa.Main))

(require '[clojure.core.server])

clojure.core.server/*session*

(defn -main [& args]
  (HelloFX/main args))
