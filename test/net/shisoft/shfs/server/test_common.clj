(ns net.shisoft.shfs.server.test-common
  (:use [net.shisoft.shfs.server.routes :only [app]]
        [clojure.data.json :only [read-str]]))

(def test-app (app))

(defn read-json [str] (read-str str :key-fn keyword))
