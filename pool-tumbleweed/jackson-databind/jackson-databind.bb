SUMMARY = "General data-binding package for Jackson (2.x)"
DESCRIPTION = "The general-purpose data-binding functionality and tree-model for Jackson Data \
Processor. It builds on core streaming parser/generator package, and uses \
Jackson Annotations for configuration."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-databind-2.18.9-2.2.noarch.rpm"
RPM_HASH = "2518d85185b263a158509fad746fefd947e5fd7ceae60556205d608a45bf17bcbe8c994139023a8255bed47467371681aed548a5e5522929ac106978908d7d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-databind \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.fasterxml.jackson.core-jackson-databind-pom- \
osgi-com.fasterxml.jackson.core.jackson-databind"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
