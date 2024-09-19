(ns api.hello.handler
  (:require [cheshire.core :as json]
            [ring.util.response :refer [response]]))

;; hello取得
(defn get-hello-handler []
  (response (json/generate-string {:message "hello world!"})))
