SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.0.11"

RPM_NAME = "libguile-3_0-1-3.0.11-1.1.aarch64.rpm"
RPM_HASH = "855093d7d351ded646367f42b1c573922e492b7bc1cd5320d6e79817eacd3de4ee51e54abe9122a449522e08b90ce24293e85b1f56098814228c1ca05213e514"

RPROVIDES:${PN} += "libguile-3-0-1 \
libguile-3.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
glibc-locale \
guile-modules-3-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libffi.so.8 \
libgc.so.1 \
libgmp.so.10 \
libm.so.6 \
libunistring.so.5"

inherit rpm
