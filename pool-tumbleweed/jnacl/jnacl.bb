SUMMARY = "eu.neilalexander:jnacl"
DESCRIPTION = "Pure Java implementation of the NaCl: Networking and Cryptography library \
Supports the following crypto primitives: curve25519xsalsa20poly1305"
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "jnacl-1.0.0-5.7.noarch.rpm"
RPM_HASH = "35085f867e56b2ea2011cbfbac41e3753efb23afab05efc8caeace967d742ec429ea21775351ec446fb52ddcf767fe3d6ba5cd1d65fab7bb1c9327eb4c7f49d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnacl \
mvn-eu.neilalexander-jnacl \
mvn-eu.neilalexander-jnacl-pom- \
osgi-eu.neilalexander.jnacl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
