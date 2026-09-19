SUMMARY = "API documentation for maven-assembly-plugin"
DESCRIPTION = "This package provides API documentation for maven-assembly-plugin."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "maven-assembly-plugin-javadoc-3.8.0-1.4.noarch.rpm"
RPM_HASH = "e04ab28b5d5766de218e9643999777fe1c911d072db9b8fdc436798bcd2887757c0f3093b4ecb5a28f057b1ae1b19a064c9101d812abf6aa34d20913a8e7fa47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-assembly-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
