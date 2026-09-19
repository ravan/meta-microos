SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-60-v-2-2-1.8.8-25.5.aarch64.rpm"
RPM_HASH = "dfe9939ebfdeec2ec0fc7e57c3fb37331c2e633fafa6aacfd8707a7501b006e4fdf58db92d48c954afcff42d82a7b089275b7de060771c3671800ffe7f1415c8"

RPROVIDES:${PN} += "libguile-srfi-srfi-60-v-2-2 \
libguile-srfi-srfi-60-v-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libguile.so.17"

inherit rpm
