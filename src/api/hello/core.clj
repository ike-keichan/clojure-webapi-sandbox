(ns api.hello.core
  (:require [compojure.core :refer [defroutes GET]]
            [api.hello.handler :refer [get-hello-handler]]))

;; hello APIのルーティング
(defroutes hello-routes
  (GET "/hello" [] (get-hello-handler)))
