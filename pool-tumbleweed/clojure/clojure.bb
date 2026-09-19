SUMMARY = "Clojure core environment and runtime library"
DESCRIPTION = "Clojure is a dynamic programming language that targets the Java Virtual \
Machine. It is designed to be a general-purpose language, combining the \
approachability and interactive development of a scripting language with an \
efficient and robust infrastructure for multithreaded programming."
LICENSE = "EPL-1.0"

PV = "1.12.6"

RPM_NAME = "clojure-1.12.6-1.1.noarch.rpm"
RPM_HASH = "7c00604b53f7f7ecf06cad3f44cdcf8868642b78847ea7c8d431d9edb456a461bcaf2f421561b37f1318e7cc9361181fca98c9c88a97118d6266d61c9df3f13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure \
mvn-org.clojure-clojure \
mvn-org.clojure-clojure-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
clojure-core-specs-alpha \
clojure-spec-alpha \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.clojure-core.specs.alpha \
mvn-org.clojure-spec.alpha"

inherit rpm
