SUMMARY = "Java API for accessing the WordNet relational dictionary"
DESCRIPTION = "JWNL is a Java API for accessing the WordNet relational dictionary. \
WordNet is widely used for developing NLP applications, and a Java \
API such as JWNL will allow developers to more easily use Java for \
building NLP applications."
LICENSE = "BSD-3-Clause"

PV = "1.4~rc3"

RPM_NAME = "jwnl-1.4~rc3-2.20.noarch.rpm"
RPM_HASH = "5843d57faf7e69d15c03384a8d357ff7d3c7d70534ac77b86a9b63a6d0b8a3b794cedbc32ca463745912a066f4d1f3cfb023b27f2ce06cc92caf486735c7dec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwnl \
mvn-jwnl-jwnl \
mvn-jwnl-jwnl-pom- \
mvn-net.sf.jwordnet-jwnl \
mvn-net.sf.jwordnet-jwnl-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
