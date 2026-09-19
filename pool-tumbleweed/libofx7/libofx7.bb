SUMMARY = "OFX Command Parser and API"
DESCRIPTION = "LibOFX is a parser and API for applications to support \
OFX command responses, usually provided by financial institutions for \
statement downloads."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.9"

RPM_NAME = "libofx7-0.10.9-2.1.aarch64.rpm"
RPM_HASH = "c55a2d07c01fa0b195552eebe4b82e2c67898ad2c4c52191fdae918503aae7b6a01c5dfb7b439c537bafc5ade3853b7748b27b4658a8a7ddab0335b20c9b60d0"

RPROVIDES:${PN} += "libofx.so.7 \
libofx7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libofx \
libosp.so.5 \
libstdc++.so.6"

inherit rpm
