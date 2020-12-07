FROM clojure
COPY . .
CMD ["/bin/bash", "./run_all_tests.sh"]
