SUMMARY = "Utilities to manage the Linux 802.15.4 WPAN stack"
DESCRIPTION = "This is a set of utils to manage the Linux WPAN stack, \
compatible with IEEE 802.15.4-2003 (and to a lesser extent, \
2006)."
LICENSE = "ISC"

PV = "0.10"

RPM_NAME = "wpan-tools-0.10-1.8.aarch64.rpm"
RPM_HASH = "9b77fdb040a77e3200887e424391408e5ebeac9190c8e6d98023c1979ed546c8d0087a5b3c223ec976a6a15405951ad6ab203d2c8c5f7da0a0502d4c5d0baa99"

RPROVIDES:${PN} += "wpan-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
