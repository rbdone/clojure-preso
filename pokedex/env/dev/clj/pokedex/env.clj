(ns pokedex.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [pokedex.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[pokedex started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[pokedex has shut down successfully]=-"))
   :middleware wrap-dev})
