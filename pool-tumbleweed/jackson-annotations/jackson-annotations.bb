SUMMARY = "Core annotations for Jackson data processor"
DESCRIPTION = "Core annotations used for value types, \
used by Jackson data-binding package."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-annotations-2.18.9-1.2.noarch.rpm"
RPM_HASH = "12b03de19f20c2e828d5cd94ececaaa4b3797af6a91a73502d5ca4b7b92b5b977b408a5df8a75842b35649877ef7b520f14c117e30b05c08745cbca754a5200d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-annotations-pom- \
osgi-com.fasterxml.jackson.core.jackson-annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
