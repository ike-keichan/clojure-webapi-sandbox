(ns api.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [compojure.core :refer [defroutes]]
            [compojure.route :as route]
            [api.hello.core :refer [hello-routes]]
            [api.tasks.core :refer [task-routes]]
            [api.db :refer [init-db]]
            [ring.middleware.params :refer [wrap-params]]
            [compojure.core :refer [context]]))

;; 全体のルーティング
(defroutes app-routes
  (context "/api" []
    hello-routes)
  (route/not-found "Not Found"))

;; ミドルウェアの適用
(def app
  (wrap-params app-routes))

;; メイン関数
(defn -main [& args]
  (init-db)
  (run-jetty app {:port 3000}))
