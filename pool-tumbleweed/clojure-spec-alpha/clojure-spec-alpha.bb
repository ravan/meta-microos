SUMMARY = "Clojure data and function specifications"
DESCRIPTION = "This package provides specifications of data and functions for Clojure."
LICENSE = "EPL-1.0"

PV = "0.6.249"

RPM_NAME = "clojure-spec-alpha-0.6.249-1.1.noarch.rpm"
RPM_HASH = "91850153bf6c4a3585b4585b120d77b2f26e69533a06b2cf37ae3e2758ea91ddefd8a8718e65f4ba2f9e5763946e3954b1ba12c472a999e546dbf654a9bba9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure-spec-alpha \
mvn-org.clojure-spec.alpha \
mvn-org.clojure-spec.alpha-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
