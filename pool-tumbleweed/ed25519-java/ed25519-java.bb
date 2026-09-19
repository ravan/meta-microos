SUMMARY = "Implementation of EdDSA (Ed25519) in Java"
DESCRIPTION = "This is an implementation of EdDSA in Java. Structurally, it \
is based on the ref10 implementation in SUPERCOP (see \
http://ed25519.cr.yp.to/software.html). \
 \
There are two internal implementations: \
 \
* A port of the radix-2^51 operations in ref10 \
  - fast and constant-time, but only useful for Ed25519. \
* A generic version using BigIntegers for calculation \
  - a bit slower and not constant-time, but compatible \
    with any EdDSA parameter specification."
LICENSE = "CC0-1.0"

PV = "0.3.0"

RPM_NAME = "ed25519-java-0.3.0-6.6.noarch.rpm"
RPM_HASH = "93eb8bd71807ccdf27f55906acc1193f0b112db1c941803917054c6d0906262022f6607dacba929e747ff5044c4f5ed5328b65a058c5aea614d1ea682f3be7bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ed25519-java \
mvn-net.i2p.crypto-eddsa \
mvn-net.i2p.crypto-eddsa-pom- \
osgi-net.i2p.crypto.eddsa"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
