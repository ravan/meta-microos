SUMMARY = "Interfaces and Classes for use in compiling OSGi bundles"
DESCRIPTION = "OSGi Compendium, Interfaces and Classes for use in compiling bundles."
LICENSE = "Apache-2.0"

PV = "8.0.0"

RPM_NAME = "osgi-compendium-8.0.0-1.8.noarch.rpm"
RPM_HASH = "d531db5b51cb17e9f9712646d156ce5eea18b38fb8c10acde1dd4092e4f97f091d3d775080cbb6fee38eace51a4a0da8be74f486edbd209fb03818b900ba06d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.cmpn-pom- \
osgi-compendium \
osgi-osgi.cmpn"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
