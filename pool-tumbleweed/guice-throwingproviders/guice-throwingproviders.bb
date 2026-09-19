SUMMARY = "ThrowingProviders extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides ThrowingProviders module for Guice."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "guice-throwingproviders-6.0.0-3.6.noarch.rpm"
RPM_HASH = "3032b4a9595f3f9b62aef850266a216d0c55da17154e09bfdad7d7209c7efd8ad85f0a9f5aca029465b614984c3dd2c14dc36db03afa013ca34b46e380dfabed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-throwingproviders \
mvn-com.google.inject.extensions-guice-throwingproviders \
mvn-com.google.inject.extensions-guice-throwingproviders-pom- \
mvn-org.sonatype.sisu.inject-guice-throwingproviders \
mvn-org.sonatype.sisu.inject-guice-throwingproviders-pom- \
osgi-com.google.inject.throwingproviders"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.errorprone-error-prone-annotations \
mvn-com.google.inject-guice"

inherit rpm
