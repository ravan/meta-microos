SUMMARY = "Plexus Cipher: encryption/decryption Component"
DESCRIPTION = "Plexus Cipher: encryption/decryption Component"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "plexus-cipher-2.1.0-2.5.noarch.rpm"
RPM_HASH = "7d6263460d0cfd4315780caf7cd51455a9bcb3f327f2b09da1379a21d6191323490c2837eef738cbb23b79600acbd4edc2dc9620bf9a4941e91898b9f1275790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-cipher \
mvn-org.codehaus.plexus-plexus-cipher-pom- \
mvn-org.sonatype.plexus-plexus-cipher \
mvn-org.sonatype.plexus-plexus-cipher-pom- \
plexus-cipher"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject"

inherit rpm
