(ns pokedex.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[pokedex started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[pokedex has shut down successfully]=-"))
   :middleware identity})
