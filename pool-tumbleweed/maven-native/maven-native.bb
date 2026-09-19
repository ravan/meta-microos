SUMMARY = "Maven plugin to compile C and C++ source"
DESCRIPTION = "Maven Native - compile C and C++ source under Maven \
with compilers such as GCC, MSVC, GCJ etc ..."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0.0"

RPM_NAME = "maven-native-1.0.0-1.2.noarch.rpm"
RPM_HASH = "0c37d76b49799d09c2085b99d40a22a07a928719a384c6bb0b24f90b3728d0b5bb51468b67f7de0053487a867d350e6bfa3237bdc6911409ca12ed78c17cf1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-native \
mvn-org.codehaus.mojo.natives-maven-native-api \
mvn-org.codehaus.mojo.natives-maven-native-api-pom- \
mvn-org.codehaus.mojo.natives-maven-native-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
