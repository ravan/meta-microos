SUMMARY = "An ANSI-BBS terminal which supports telnet, rlogin, and SSH"
DESCRIPTION = "An ANSI-BBS terminal designed to connect to remote BBSs via telnet, rlogin, or \
SSH. Supports ANSI music and the IBM charset when possible. Will run from a \
console, under X11 using XLib, or using SDL."
LICENSE = "GPL-2.0-only"

PV = "1.9"

RPM_NAME = "syncterm-1.9-1.1.aarch64.rpm"
RPM_HASH = "63f8f76daacf1e55ba0765136bd5c9c57a088db87a8f8173f35b1515370cc0cfc0d620d12800a02a6c99f4d45cb75c291dbdd035ec92dd470bc207406e79e0bc"

RPROVIDES:${PN} += "syncterm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
