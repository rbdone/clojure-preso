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



(defn convert-item [item]
  (def itemName (get (get item "name") "english"))
  (def itemBase (get item "base"))
  (def itemType (get item "type"))

  {(keyword `~itemName) {:id   (get item "id")
                         :name itemName
                         :base itemBase
                         :type itemType}})


(defn convert-to-hashmap [data]
  (def firstItem (convert-item (first data)))
  (println (count data))
  (println firstItem)
  (println "")

  (if (= (count data) 1)
    firstItem
    (conj firstItem
          (convert-to-hashmap (rest data)))))



(defn pokedex [request]
  (def file (java.io.File. "pokedex.json"))
  (slurp file)
  (def data (j/read-value file))

  (println (convert-to-hashmap data))

  {:status  200
   :headers {"Content-Type" "application/json"}
   :body    "test"})
   ;:body    (j/write-value-as-bytes (convert-item combined))})
   ;:body (j/write-value-as-bytes (convert-to-obj-map data))})



(defn api-routes []
  ["/api"
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" {:get api-page}]
   ["/pokedex" {:get pokedex}]])

