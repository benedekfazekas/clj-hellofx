(ns thomasa.hellofx
  (:require [clojure.java.io :as io])
  (:import [javafx.application Application]
           [javafx.geometry Pos]
           [javafx.scene Scene Node]
           [javafx.scene.control Label]
           [javafx.scene.image Image ImageView]
           [javafx.scene.layout VBox]
           [javafx.stage Stage])
  (:gen-class
   :name thomasa.HelloFX
   :extends javafx.application.Application))

(defn -start [_app ^Stage stage]
  (let [label (Label. (str "Hello, JavaFX " (System/getProperty "javafx.version")
                           ", running on Java " (System/getProperty "java.version")))
        image-view (ImageView. (Image. (io/input-stream (io/resource "openduke.png"))))
        root (VBox. 30 (into-array Node [image-view label]))
        scene (Scene. root 640 480)]
    (.setFitHeight image-view 200)
    (.setPreserveRatio image-view true)

    (.setAlignment root Pos/CENTER)

    (.add (.getStylesheets scene) (.toExternalForm (io/resource "styles.css")))
    (.setScene stage scene)
    (.show stage)))

(defn -main [& args]
  (Application/launch thomasa.HelloFX (into-array String args)))
