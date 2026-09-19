SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile17-1.8.8-25.5.aarch64.rpm"
RPM_HASH = "62e2d9833278eb187d79e07f3d6370bd95e26b9a59888f5399792d228eb76e89326611b465de95af7eae6bb382588f8f38a910ff19610a122bb5bde737a3413f"

RPROVIDES:${PN} += "libguile.so.17 \
libguile17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgmp.so.10 \
libltdl.so.7 \
libm.so.6"

inherit rpm
