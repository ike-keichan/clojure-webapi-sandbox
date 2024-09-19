(defproject clojure-webapi-sandbox "0.1.0-SNAPSHOT"
  :dependencies [[cheshire "5.10.0"]                    ;; JSONエンコード/デコード用のライブラリ
                 [compojure "1.6.2"]                    ;; Compojure（ルーティングライブラリ）
                 [mysql/mysql-connector-java "8.0.33"]  ;; MySQLのJDBCドライバ
                 [org.clojure/clojure "1.10.3"]         ;; Clojureのバージョン1.10.3
                 [org.clojure/java.jdbc "0.7.12"]       ;; Java JDBC（データベースアクセス用）
                 [org.clojure/tools.logging "1.2.4"]    ;; ロギングライブラリ
                 [ring/ring-core "1.9.2"]               ;; Ringコアライブラリ（HTTPサーバーの構築用）
                 [ring/ring-jetty-adapter "1.9.2"]]     ;; RingのJettyアダプター（Jettyサーバーのため）
  :source-paths ["src"]
  :test-paths ["test"]
  :main ^:skip-aot api.core
  :profiles {:dev {:dependencies []}})
