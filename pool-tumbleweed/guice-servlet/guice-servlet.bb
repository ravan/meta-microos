SUMMARY = "Servlet extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides Servlet module for Guice."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "guice-servlet-6.0.0-3.6.noarch.rpm"
RPM_HASH = "22e5be01d2e5c5362fec658e0855b48d94de852311b993621f11d9a86336a5308533567426966f9e8245632a7754a585d9b87f5a3a1e193d537e9d9b57050045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-servlet \
mvn-com.google.inject.extensions-guice-servlet \
mvn-com.google.inject.extensions-guice-servlet-pom- \
mvn-org.sonatype.sisu.inject-guice-servlet \
mvn-org.sonatype.sisu.inject-guice-servlet-pom- \
osgi-com.google.inject.servlet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.inject-guice"

inherit rpm
