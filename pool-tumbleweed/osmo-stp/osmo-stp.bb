SUMMARY = "Osmocom SIGTRAN STP (Signaling Transfer Point)"
DESCRIPTION = "This is the Osmocom (Open Source Mobile Communications) \
implementation of a Signaling Transfer Point (STP) for SS7/SIGTRAN \
telecommunication networks. At this point, it is a minimal \
implementation, missing lots of the functionality usually present in \
a STP, such as Global Title Routing, Global Title Translation."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.0"

RPM_NAME = "osmo-stp-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "987cda35722e1d7954f163f8c7e638faadbab53e8eccd0178d21d34bad3238112ee591a4f4926ade6034b0de828f6e98fd4b00769dc6b70a3a27c13e69ea3177"

RPROVIDES:${PN} += "config-osmo-stp \
osmo-stp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-sigtran.so.12 \
libosmocore.so.22 \
libosmovty.so.13 \
libtalloc.so.2"

inherit rpm
