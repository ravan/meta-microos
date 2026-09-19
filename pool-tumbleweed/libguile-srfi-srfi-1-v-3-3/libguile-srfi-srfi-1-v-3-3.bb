SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-1-v-3-3-1.8.8-25.5.aarch64.rpm"
RPM_HASH = "82a4edd5a0fc2d6b76ac52f0da89c5e8a75d5b831a780e0ee10583dc0eaf290462ed3d041b93e61a328e5807f5cfdb336eb567dd3d1a67d6fc078368a50fece5"

RPROVIDES:${PN} += "libguile-srfi-srfi-1-v-3-3 \
libguile-srfi-srfi-1-v-3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile.so.17"

inherit rpm
