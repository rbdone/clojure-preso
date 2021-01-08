(ns pokedex.routes.api
  (:require
    [pokedex.layout :as layout]
    [clojure.java.io :as io]
    [pokedex.middleware :as middleware]
    [ring.util.response]
    [ring.util.http-response :as response]
    [jsonista.core :as j]))

(defn api-page [request]
  (layout/render request "api.html"))

(defn pokedex [request]
  {:status  200
   :headers {"Content-Type" "application/json"}
   :body    (j/write-value-as-bytes {:foo "bar" :age 23})})

(defn api-routes []
  ["/api"
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" {:get api-page}]
   ["/pokedex" {:get pokedex}]])

