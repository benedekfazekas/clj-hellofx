(ns thomasa.main
  (:require [clojure.core.server])
  (:import [thomasa HelloFX])
  (:gen-class
   :name thomasa.Main))

(defn -main [& args]
  (HelloFX/main args))
