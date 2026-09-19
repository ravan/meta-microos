SUMMARY = "Extensions for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides extensions POM for Guice."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "guice-extensions-6.0.0-3.6.noarch.rpm"
RPM_HASH = "5917596e611cc5a696fe0bc2a392231e273519de65065f10e858997f789b5cccca7167a9019ad235ac0ccfb657ee7e8c1c220bb1547346cba05a8b733f6f53ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-extensions \
mvn-com.google.inject.extensions-extensions-parent-pom- \
mvn-org.sonatype.sisu.inject-extensions-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
