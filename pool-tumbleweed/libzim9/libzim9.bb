SUMMARY = "Shared library for libzim"
DESCRIPTION = "The ZIM library is the reference implementation for the ZIM file format. \
It's a solution to read and write ZIM files on many systems and \
architectures. More information about the ZIM format and the openZIM \
project at https://openzim.org/. \
 \
This package contains shared library of the reference implementaation of \
ZIM file format."
LICENSE = "GPL-2.0-or-later"

PV = "9.8.2"

RPM_NAME = "libzim9-9.8.2-1.1.aarch64.rpm"
RPM_HASH = "b2627497fdb4507971b40a95cf2da932a1c084fd53701576c23f6fa484e7c385c84a763ea1aa72c5304c7732586ba43b573d4db608537f674e073d087c239fc3"

RPROVIDES:${PN} += "libzim.so.9 \
libzim9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
liblzma.so.5 \
libstdc++.so.6 \
libxapian.so.30 \
libzstd.so.1"

inherit rpm
