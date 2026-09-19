SUMMARY = "Yet Another Hex Dumper"
DESCRIPTION = "A hex dumper that does CP/M and EBCDIC formatting and has \
internationalization support."
LICENSE = "BSD-3-Clause"

PV = "1.11"

RPM_NAME = "hex-1.11-1.9.aarch64.rpm"
RPM_HASH = "d5f2a9e28ff2ec70fd3fdb860277cbabc92efe70d27e547444d926cd21032621aeb6a428c14a609d88131105d0c1cc8899fa231a4c8137a407acd420fc9da7d4"

RPROVIDES:${PN} += "hex \
util-linux-/usr/bin/hex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
