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
                 [compojure "1.1.5"]
                 [ring "1.3.1"]
                 [ring/ring-json "0.3.1"]
                 [org.clojure/data.json "0.2.1"]
                 [http-kit "2.1.18"]
                 [http-kit/dbcp "0.1.0"] ;; database access

                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/core.cache "0.6.4"]

                 [postgresql "9.3-1102.jdbc41"]

                 ;; [org.fressian/fressian "0.6.3"]

                 ;; for serialization clojure object to bytes
                 [com.taoensso/nippy "2.8.0"]

                 ;; Redis client & message queue
                 ;; [com.taoensso/carmine "1.5.0"]

                 ;; logging,  another option [com.taoensso/timbre "1.5.2"]
                 [org.clojure/tools.logging "0.2.6"]
                 [ch.qos.logback/logback-classic "1.0.1"]
                 ;; template
                 [me.shenfeng/mustache "1.1"]])
