SUMMARY = "Clojure core environment and runtime library"
DESCRIPTION = "Clojure is a dynamic programming language that targets the Java Virtual \
Machine. It is designed to be a general-purpose language, combining the \
approachability and interactive development of a scripting language with an \
efficient and robust infrastructure for multithreaded programming."
LICENSE = "EPL-1.0"

PV = "1.12.6"

RPM_NAME = "clojure-bootstrap-1.12.6-1.1.noarch.rpm"
RPM_HASH = "be37edc26dcfe0055ee62c770a2d6667c894fe561aa59ec11764c96230f775464ea4908276645d99d4336c008e2042ba9bfed92d5853d931bbddb1e153f975f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure-bootstrap \
mvn-org.clojure-clojure \
mvn-org.clojure-clojure-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.clojure-core.specs.alpha \
mvn-org.clojure-spec.alpha"

inherit rpm
