; The challenge
;;
;;  Create an endpoint to retrieve Pokemon by id!!
;;
;;  The data:
;;    https://github.com/fanzeyi/pokemon.json/blob/master/pokedex.json
;;
;;  Extra credit:
;;    Display the pokemon data and images within your luminus web app

;; hint
lein new luminus pokedex

cd pokedex-api
lein run

;; a json parsing library is already a dependency of luminus, you can use this to read the json
;;    https://github.com/metosin/jsonista
;;    includes example documentation for reading a file using the Java file class
(def file (java.io.File. "hello.json"))
(slurp file)
(j/read-value file)






