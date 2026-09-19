SUMMARY = "Osmocom library for muxed audio"
DESCRIPTION = "Network interface demuxer library for OsmoCom projects."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmonetif11-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "55d88ed14aecfa4775a95841a39923d8891ea0d85e3607392b59cb1017dc438afa5a3ef38ad66b61e78274fb6d1af1ff5d74f306e8790dbd72f4b47eafe819fa"

RPROVIDES:${PN} += "libosmonetif.so.11 \
libosmonetif11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libosmogsm.so.20 \
libosmovty.so.13 \
libsctp.so.1 \
libtalloc.so.2"

inherit rpm
