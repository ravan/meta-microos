SUMMARY = "Extra compiler support for plexus-compiler"
DESCRIPTION = "Additional support for csharp, eclipse and jikes compilers"
LICENSE = "Apache-2.0"

PV = "2.16.2"

RPM_NAME = "plexus-compiler-extras-2.16.2-1.3.noarch.rpm"
RPM_HASH = "5caea568b0bc01b107384be3aca87f6c8c8071db3843e3c9a2683a343e84cd4e1ba4b71b1a588c882abc80633a078e7cac158335f36182ea5be1ed193635aad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-compiler-csharp \
mvn-org.codehaus.plexus-plexus-compiler-csharp-pom- \
mvn-org.codehaus.plexus-plexus-compiler-eclipse \
mvn-org.codehaus.plexus-plexus-compiler-eclipse-pom- \
plexus-compiler-extras"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.jdt-ecj \
mvn-org.slf4j-slf4j-api"

inherit rpm
