SUMMARY = "Development files for statically link leveldb"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store. \
 \
This package holds the development files for statically linking leveldb."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "leveldb-devel-static-1.23-6.7.aarch64.rpm"
RPM_HASH = "8fd9724c37e6ce5563c375e3a5da453a25158b2a924db90f9179fb1ab58e9580d2384e0d5b9ca69c0e3df822ed72a58d6314c112e319a45732be7049991d0cb6"

RPROVIDES:${PN} += "leveldb-devel-static"

RDEPENDS:${PN} += "leveldb-devel"

inherit rpm
