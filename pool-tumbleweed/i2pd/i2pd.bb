SUMMARY = "C++ implementation of an I2P client"
DESCRIPTION = "The Invisible Internet Protocol (I2P) is a universal anonymous network layer. All \
communications over I2P are anonymous and end-to-end encrypted, participants \
don't reveal their real IP addresses. \
 \
This package contains a C++ implementation of an I2P router."
LICENSE = "BSD-3-Clause"

PV = "2.58.0"

RPM_NAME = "i2pd-2.58.0-1.9.aarch64.rpm"
RPM_HASH = "b87cbc30f9139aa53c26a5ec127641d53f7b14dd5d7161a6793cbb9e6f8472942e3aae23a8cd9401aae4a4fc12efb1003efe16a0cd019f3a04cfeb443106e00d"

RPROVIDES:${PN} += "config-i2pd \
group-i2pd \
i2pd \
user-i2pd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libminiupnpc.so.21 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
shadow \
systemd"

inherit rpm
