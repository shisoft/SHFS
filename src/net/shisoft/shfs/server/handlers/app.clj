(ns net.shisoft.shfs.server.handlers.app
  (:require [net.shisoft.shfs.server.tmpls :as tmpl]))

(defn show-landing [req]
  (tmpl/landing {:user-agent (get-in req [:headers "user-agent"])
                 :title "TODO: your app title"
                 :list ["list item 1"
                        "list item 2"]}))
