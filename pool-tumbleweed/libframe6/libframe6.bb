SUMMARY = "Touch frame library"
DESCRIPTION = "This package provides the tree that handles the buildup and \
synchronisation of a set of simultaneous touches."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.0+bzr20160809"

RPM_NAME = "libframe6-2.5.0+bzr20160809-4.8.aarch64.rpm"
RPM_HASH = "db467b418f3e07c631825052d9bab5934f3ffa0001149317ba1ffc17a8ef09a5b98dc2b7b7f9a949213afd204c00c040b390a7a5a8fa81248109dc01bc4aa06d"

RPROVIDES:${PN} += "libframe.so.6 \
libframe6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
