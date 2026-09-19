SUMMARY = "JMX extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides JMX module for Guice."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "guice-jmx-6.0.0-3.6.noarch.rpm"
RPM_HASH = "ddf29e8e7847831257bf5fef94b7b42b51428ffd38fac91aafc371e01c5845189eddc0639d8d934794da649c96f9165c402e5ea54c8154876d71dc19dd3dc54c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-jmx \
mvn-com.google.inject.extensions-guice-jmx \
mvn-com.google.inject.extensions-guice-jmx-pom- \
mvn-org.sonatype.sisu.inject-guice-jmx \
mvn-org.sonatype.sisu.inject-guice-jmx-pom- \
osgi-com.google.inject.tools.jmx"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.inject-guice"

inherit rpm
