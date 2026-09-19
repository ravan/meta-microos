SUMMARY = "LibEVDI Library"
DESCRIPTION = "The Extensible Virtual Display Interface (EVDI) is a Linux kernel module \
that enables management of multiple screens, allowing user-space programs \
to take control over what happens with the image. It is essentially \
a virtual display you can add, remove and receive screen updates for, in \
an application that uses the libevdi library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "libevdi1-1.15.0-1.2.aarch64.rpm"
RPM_HASH = "1f57ccf33101da77e61340ee9b1c4e42edf1ea123d4485eddc1fb04022020ab66a65c00c42774672d498b68d7c73f62564ae47939072d6686677b41974d93684"

RPROVIDES:${PN} += "libevdi.so.1 \
libevdi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
evdi-kmp \
libc.so.6"

inherit rpm
