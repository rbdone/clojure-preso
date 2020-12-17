; reminder to run `kubeoff`

; Setup

;; Install Java
brew install java   ;; installs OpenJDK

echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> ~/.zshrc


;; Install Clojure and Lein (a clojure build tool)
brew install clojure/tools/clojure

brew install leiningen


;; Run Clojure REPL
clj


;; Create a new project from the built-in "app" template
lein new app my-app

cd my-app
lein run


; Clojure VSCode plugins are awesome!
“Clojure”
“Rainbow Brackets”

;; Note: “Calva” is the most popular, but I haven’t used it yet

