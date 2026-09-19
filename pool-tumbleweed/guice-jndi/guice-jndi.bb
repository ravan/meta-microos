SUMMARY = "JNDI extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides JNDI module for Guice."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "guice-jndi-6.0.0-3.6.noarch.rpm"
RPM_HASH = "5c82c8569bb873fdd7e7167f07ae191c140a6ef1966c62160d40687158acee92042d669256e1ce27b2ca21d2b6d2e62a25bae5522b6cf9c3418413da46594c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-jndi \
mvn-com.google.inject.extensions-guice-jndi \
mvn-com.google.inject.extensions-guice-jndi-pom- \
mvn-org.sonatype.sisu.inject-guice-jndi \
mvn-org.sonatype.sisu.inject-guice-jndi-pom- \
osgi-com.google.inject.jndi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.inject-guice"

inherit rpm
