SUMMARY = "Apache Extras Companion for Apache log4j"
DESCRIPTION = "Apache Extras Companion for Apache log4j is a collection of appenders, \
filters, layouts, and receivers for Apache log4j 1.2"
LICENSE = "Apache-2.0"

PV = "1.2.17.1"

RPM_NAME = "apache-log4j-extras-1.2.17.1-4.11.noarch.rpm"
RPM_HASH = "f3217edadc1210e2d02afbfb3fd906c02ad90c98b4f323c0517f8cb86b10e7607ddad1f4da88acd313970dd36ff1e981fe5002d321e944bda52ba28907ea0603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-log4j-extras \
mvn-log4j-apache-log4j-extras \
mvn-log4j-apache-log4j-extras-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-log4j-log4j"

inherit rpm
