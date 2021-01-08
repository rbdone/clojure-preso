(ns pokedex.routes.api
  (:require
    [pokedex.layout :as layout]
    [clojure.java.io :as io]
    [pokedex.middleware :as middleware]
    [ring.util.response]
    [ring.util.http-response :as response]))

(defn api-page [request]
  (layout/render request "api.html"))

(defn pokedex [request])

(defn api-routes []
  ["/api"
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" {:get api-page}]
   ["/pokedex" {:get (fn [request]
                       {:status  200
                        :headers {}
                        :body    {:foo "Bar"}})}]])

