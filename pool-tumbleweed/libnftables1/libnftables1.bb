SUMMARY = "nftables firewalling command interface"
DESCRIPTION = "libnftables is the nftables command line interface placed into a \
library."
LICENSE = "GPL-2.0-only"

PV = "1.1.7"

RPM_NAME = "libnftables1-1.1.7-1.1.aarch64.rpm"
RPM_HASH = "c42d25cde1a46c68118894e7abc2cec7f8f32856c686ca9a785646bb8f8aa98f5f2500005d74be1404fa20ee5cab68a5a7c789cd2a71d683cbb784a03f6236a6"

RPROVIDES:${PN} += "libnftables.so.1 \
libnftables1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libjansson.so.4 \
libmnl.so.0 \
libnftnl.so.11"

inherit rpm
