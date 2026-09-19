SUMMARY = "Java Pretty Good Privacy Jig"
DESCRIPTION = "JPGPJ provides a simple API on top of the Bouncy Castle Java OpenPGP \
implementation (which is full and robust implementation of RFC 4880, and \
compatible with other popular PGP implementations such as GnuPG, GPGTools, and \
Gpg4win). The JPGPJ API is limited to file encryption, signing, decryption, and \
verification; it does not include the ability to generate, update, or sign \
keys, or to do clearsigning or detached signatures."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "jpgpj-1.3-1.5.noarch.rpm"
RPM_HASH = "f59304ee14d140462ab8dbbcb45cf8e53399591dce1f95641878b4d0e7359767cee1d61e786ecfd04ee38667b39ac6d32c8c3843948839c021371eaad0a6087e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jpgpj \
mvn-org.c02e.jpgpj-jpgpj \
mvn-org.c02e.jpgpj-jpgpj-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcpg-jdk15on \
mvn-org.slf4j-slf4j-api"

inherit rpm
