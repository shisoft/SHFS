(defproject net.shisoft.shfs.server "0.1.0-SNAPSHOT"
  :description "A Simple Small Files Distirbuted File System"
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main net.shisoft.shfs.server.main
  :aot [net.shisoft.shfs.server.main]
  :uberjar-name "net.shisoft.shfs.server-standalone.jar"
  ;; :plugins [[lein-swank "1.4.4"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.cli "0.2.2"]
                 [cluster-connector "0.1.0-SNAPSHOT"]])
