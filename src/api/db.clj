(ns api.db
  (:require [clojure.java.jdbc :as jdbc]
            [clojure.tools.logging :as log]))

;; DBの情報
(def db-spec {:classname "com.mysql.cj.jdbc.Driver"
              :subprotocol "mysql"
              :subname "//db:3306/demo" 
              :user "root"
              :password ""})

;; DB接続する関数
(defn init-db []
  (try
    (jdbc/execute! db-spec
      ["CREATE TABLE IF NOT EXISTS tasks (id INT AUTO_INCREMENT PRIMARY KEY, title VARCHAR(255), dueDate DATE, isDone BOOLEAN)"])
    (log/info "Table 'tasks' initialized successfully.")
    (catch Exception e
      (log/error e "Error initializing the 'tasks' table."))))
