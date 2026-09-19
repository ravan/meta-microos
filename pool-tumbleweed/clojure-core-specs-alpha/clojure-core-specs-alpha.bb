SUMMARY = "Clojure core specifications"
DESCRIPTION = "This package provides specifications for clojure.core."
LICENSE = "EPL-1.0"

PV = "0.5.81"

RPM_NAME = "clojure-core-specs-alpha-0.5.81-1.1.noarch.rpm"
RPM_HASH = "8b1cba4636ae5ebf393bb988afd1cd9f8e0846529f5528c630971c65436bd2381b0b095c859c32625047b02dba914364ed785aca907e60fb3280f7e67cc9fa47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure-core-specs-alpha \
mvn-org.clojure-core.specs.alpha \
mvn-org.clojure-core.specs.alpha-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
