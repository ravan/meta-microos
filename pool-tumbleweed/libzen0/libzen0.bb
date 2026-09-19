SUMMARY = "The ZenLib C++ utility library"
DESCRIPTION = "ZenLib is a C++ utility library. It includes classes for handling \
strings, configuration, bit streams, threading, translation \
and cross-platform operating system functions."
LICENSE = "Zlib"

PV = "0.4.41"

RPM_NAME = "libzen0-0.4.41-1.11.aarch64.rpm"
RPM_HASH = "36621ab85edfacd99559038fc6b6ba3927c04ee346baa7c7eb8155a523465c69a61e2a82a2a4bcadaee5612497a3f769f33f2d8211d46b0b07e95418e985c822"

RPROVIDES:${PN} += "libzen.so.0 \
libzen0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
