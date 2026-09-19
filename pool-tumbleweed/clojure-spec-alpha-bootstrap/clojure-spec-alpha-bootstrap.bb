SUMMARY = "Clojure data and function specifications"
DESCRIPTION = "This package provides specifications of data and functions for Clojure."
LICENSE = "EPL-1.0"

PV = "0.6.249"

RPM_NAME = "clojure-spec-alpha-bootstrap-0.6.249-1.1.noarch.rpm"
RPM_HASH = "39e73a99c7957955766730f8af99ecfaf0f61a9f1c93e8dbcc23f078cf7d9f9a099b8b41d3d9762cb71f81b680aa94f33c1d93061f97044a4c11ee4d0e5d3aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure-spec-alpha-bootstrap \
mvn-org.clojure-spec.alpha \
mvn-org.clojure-spec.alpha-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
