(defproject PoltakDB "0.1.0-SNAPSHOT"
  :description "An experimental NoSQL database"
  :url "https://github.com/poltak/poltak-db"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot PoltakDB.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
