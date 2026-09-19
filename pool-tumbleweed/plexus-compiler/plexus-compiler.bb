SUMMARY = "Compiler call initiators for Plexus"
DESCRIPTION = "Plexus Compiler adds support for using various compilers from a \
unified api. Support for javac is available in main package. For \
additional compilers see plexus-compiler-extras package."
LICENSE = "Apache-2.0 & MIT"

PV = "2.16.2"

RPM_NAME = "plexus-compiler-2.16.2-1.3.noarch.rpm"
RPM_HASH = "7fbfb2b45365f46b34ebbc61e980f7fedd21f139416f20e4ccb0e4dcf25923f0ea068128d9a854842782eb2a82704e616ad682f3eb4ec496a7beee4d82fb9d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.codehaus.plexus-plexus-compiler-api-pom- \
mvn-org.codehaus.plexus-plexus-compiler-javac \
mvn-org.codehaus.plexus-plexus-compiler-javac-pom- \
mvn-org.codehaus.plexus-plexus-compiler-manager \
mvn-org.codehaus.plexus-plexus-compiler-manager-pom- \
plexus-compiler"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-api"

inherit rpm
