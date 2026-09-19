SUMMARY = "GTP tunnel configuration utilities"
DESCRIPTION = "Utilities to configure GTP tunnels."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.3"

RPM_NAME = "libgtpnl-tools-1.3.3-1.4.aarch64.rpm"
RPM_HASH = "4e6bf37cf42a04dd23d54f5f3a2ca06059f00fc88e299560db45c57bc5408d5a458cbaf37ab4cf94e8f2464a91ef2a0af88610db298ea94cd2d6232a31611d87"

RPROVIDES:${PN} += "libgtpnl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgtpnl.so.0 \
libmnl.so.0"

inherit rpm
