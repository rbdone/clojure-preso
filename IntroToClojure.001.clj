; reminder to run `kubeoff`

; repl
clj


; The operator always comes first, followed by any number of arguments
(+ 1 2 3)   ; 6


; An array
[1 2 3]     ; [1 2 3]


; Simple conditional
(if true
  "Pizza time!"
  "no pizza for you!")   ; "Pizza time!"

(def bob "Bob")

; Print the result of a conditional
(println
 (if true
   "Pizza time!"
   "no pizza for you!"))  ; nil (the return value from a call to "println")


; In clojure, (operator operand1 operand2 ...) is called a "Form"
(if true
  (do
    (println "Time for lunch...")
    (println "Time for lunch...")
    (println "Time for lunch...")
    (println "Time for lunch...")
    (println "Time for lunch...")
    (println "...come now or you'll go hungry")))


; Clojure API Cheatsheet - https://clojure.org/api/cheatsheet
; other API docs - https://clojure.org/api/api


