.PHONY: clean build-clojure gluon-build

clean:
	rm -rf target

target:
	mkdir -p target/classes

build-clojure: target
	clojure -J-Dclojure.compiler.direct-linking=true -e "(binding [*compile-path* \"target/classes\"] (compile 'thomasa.hello))"

gluon-build: build-clojure
	mvn client:build client:package
