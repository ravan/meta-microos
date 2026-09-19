SUMMARY = "An implementation the OpenBSD Blowfish password hashing algorithm"
DESCRIPTION = "jBCrypt is an implementation the OpenBSD Blowfish password hashing \
algorithm. \
 \
This system hashes passwords using a version of Bruce Schneier's \
Blowfish block cipher with modifications designed to raise the cost of \
off-line password cracking. The computation cost of the algorithm is \
parameterised, so it can be increased as computers get faster."
LICENSE = "ISC"

PV = "1.0.2"

RPM_NAME = "jbcrypt-1.0.2-1.9.noarch.rpm"
RPM_HASH = "c765c977b8dd3589706f5416bef1376dd3b8f45897fb470c4be0fe9bcd1b54a314c6a828828ed06bc137f4152ffeae28708eb55cead6b6c7bfd07e014b3d7b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jbcrypt \
mvn-org.connectbot-jbcrypt \
mvn-org.connectbot-jbcrypt-pom- \
mvn-org.connectbot.jbcrypt-jbcrypt \
mvn-org.connectbot.jbcrypt-jbcrypt-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
