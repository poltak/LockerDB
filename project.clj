(defproject LockerDB "0.1.0-SNAPSHOT"
  :description "An experimental key-value NoSQL database"
  :url "https://github.com/poltak/LockerDB"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot LockerDB.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
