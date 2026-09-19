SUMMARY = "Networking library for SDL"
DESCRIPTION = "This is a small cross-platform networking library for use with SDL."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.8"

RPM_NAME = "libSDL_net-1_2-0-1.2.8-8.8.aarch64.rpm"
RPM_HASH = "de41842f54c78d1dd4bd131bb9610fc2ad15f73cf702cc4d13d09bca5b2eab6d82b56758bd36df4aacdfebb6d1ed7f21fa030dcaa0ebcc6efdb4200a5aa66479"

RPROVIDES:${PN} += "SDL-net \
libSDL-net-1-2-0 \
libSDL-net-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6"

inherit rpm
