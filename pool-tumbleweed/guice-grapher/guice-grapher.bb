SUMMARY = "Grapher extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides Grapher module for Guice."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "guice-grapher-6.0.0-3.6.noarch.rpm"
RPM_HASH = "dc36c6e60716a77dcb81164621b701d7fce55c4c134d69fd24f7fa444ff05fc2913929981572d81dbbee29ab70130712672dbacd6d717c0e7eb3d0e3f1a5c8e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-grapher \
mvn-com.google.inject.extensions-guice-grapher \
mvn-com.google.inject.extensions-guice-grapher-pom- \
mvn-org.sonatype.sisu.inject-guice-grapher \
mvn-org.sonatype.sisu.inject-guice-grapher-pom- \
osgi-com.google.inject.grapher"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.inject-guice \
mvn-com.google.inject.extensions-guice-assistedinject"

inherit rpm
