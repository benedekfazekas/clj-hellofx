(ns thomasa.hellofx
  (:import [javafx.application Application]
           [javafx.scene Scene Node]
           [javafx.scene.control Label]
           [javafx.scene.layout VBox]
           [javafx.stage Stage])
  (:gen-class
   :name thomasa.HelloFX
   :extends javafx.application.Application))

(defn -start [_app ^Stage stage]
  (let [label (Label. (str "Hello, JavaFX " (System/getProperty "javafx.version")
                           ", running on Java " (System/getProperty "java.version") "."))
        root (VBox. 30 (into-array Node [label]))
        scene (Scene. root 640 480)]
    (.setScene stage scene)
    (.show stage)))

(defn -main [& args]
  (Application/launch thomasa.HelloFX (into-array String args)))
