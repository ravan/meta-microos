SUMMARY = "Support for reading and writing content of 'Java Properties' files"
DESCRIPTION = "Jackson data format module that supports reading and writing Java Properties \
files, using naming convention to determine implied structure (by default \
assuming dotted notation, but configurable from non-nested to other \
separators)."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-dataformat-properties-2.18.9-1.1.noarch.rpm"
RPM_HASH = "4bfd044aa0490a8958448a5f17eed8512be3aa827bd94f71c86fe658fb76df15b4a5d1331b0d3ecc8443aecc5b5caa4c55caf34a7de077ce78249837f5753093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-properties \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-properties \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-properties-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-properties"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
