(ns thomasa.hello)

(defn hello-text []
  (let [{:keys [major minor incremental qualifier]} *clojure-version*]
    (str "Hello JavaFX " (System/getProperty "javafx.version")
         ", running on Java " (System/getProperty "java.version")
         (format " and on Clojure %d.%d.%d%s" major minor incremental (or (and qualifier (str "-" qualifier)) ""))
         ".")))
