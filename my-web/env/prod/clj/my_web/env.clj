(ns my-web.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[my-web started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[my-web has shut down successfully]=-"))
   :middleware identity})
