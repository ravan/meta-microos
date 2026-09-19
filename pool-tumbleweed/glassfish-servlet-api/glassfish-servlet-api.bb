SUMMARY = "Java Servlet API"
DESCRIPTION = "The javax.servlet package contains a number of classes \
and interfaces that describe and define the contracts between \
a servlet class and the runtime environment provided for \
an instance of such a class by a conforming servlet container."
LICENSE = "Apache-2.0 & (CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "4.0.1"

RPM_NAME = "glassfish-servlet-api-4.0.1-1.7.noarch.rpm"
RPM_HASH = "bb2587f737a0ce7d8582b745dcb78b9ec8f943765eecf45ef48b845a648893daa380a2c90ea07a5893961fd25f64d70830dc260f1062d431ee7e39eddf300249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-servlet-api \
mvn-javax.servlet-javax.servlet-api \
mvn-javax.servlet-javax.servlet-api-pom- \
mvn-javax.servlet-servlet-api \
mvn-javax.servlet-servlet-api-pom- \
mvn-org.apache.geronimo.specs-geronimo-servlet-3.0-spec \
mvn-org.apache.geronimo.specs-geronimo-servlet-3.0-spec-pom- \
mvn-org.eclipse.jetty.orbit-javax.servlet \
mvn-org.eclipse.jetty.orbit-javax.servlet-pom- \
osgi-javax.servlet-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
