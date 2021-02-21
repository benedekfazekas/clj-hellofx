(ns thomasa.main
  (:import [thomasa HelloFX])
  (:gen-class
   :name thomasa.Main))

(defn -main [& args]
  (HelloFX/main args))
