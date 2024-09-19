FROM clojure:openjdk-17-lein

WORKDIR /app

COPY project.clj /app/

RUN lein deps;

COPY src /app/src

CMD ["lein", "run"]
