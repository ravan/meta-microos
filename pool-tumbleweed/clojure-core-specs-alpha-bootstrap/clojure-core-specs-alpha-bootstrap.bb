SUMMARY = "Clojure core specifications"
DESCRIPTION = "This package provides specifications for clojure.core."
LICENSE = "EPL-1.0"

PV = "0.5.81"

RPM_NAME = "clojure-core-specs-alpha-bootstrap-0.5.81-1.1.noarch.rpm"
RPM_HASH = "a0faa1cff2d9658787930f3fdb6786b0e8ac631eb3ddec81a559983dc97385b662aca869cb9a92b76d74f4754cfacc92cf48f37a0abb887ee9aea860e09f64b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure-core-specs-alpha-bootstrap \
mvn-org.clojure-core.specs.alpha \
mvn-org.clojure-core.specs.alpha-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
