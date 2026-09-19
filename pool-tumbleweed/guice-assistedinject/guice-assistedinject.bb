SUMMARY = "AssistedInject extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides AssistedInject module for Guice."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "guice-assistedinject-6.0.0-3.6.noarch.rpm"
RPM_HASH = "efac3bd6e376d0e71986a4a1f965aedfb2a07572a89cf77c88821265e8413a9bf9133bebed35cf74ae706405270d4223ff96610eefe7645a3fbd4a36b907b570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-assistedinject \
mvn-com.google.inject.extensions-guice-assistedinject \
mvn-com.google.inject.extensions-guice-assistedinject-pom- \
mvn-org.sonatype.sisu.inject-guice-assistedinject \
mvn-org.sonatype.sisu.inject-guice-assistedinject-pom- \
osgi-com.google.inject.assistedinject"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.errorprone-error-prone-annotations \
mvn-com.google.inject-guice"

inherit rpm
