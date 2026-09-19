SUMMARY = "Guice parent POM"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides parent POM for Guice modules."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "guice-parent-6.0.0-3.6.noarch.rpm"
RPM_HASH = "1fc9b08de1b5ae88e6e9495ccff58a36184afedd42ecdfcda42209dfef5a833224536ef2685081887848323647ad22706a8a59efb449b238ff3fb1ccb0424b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-parent \
mvn-com.google.inject-guice-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
