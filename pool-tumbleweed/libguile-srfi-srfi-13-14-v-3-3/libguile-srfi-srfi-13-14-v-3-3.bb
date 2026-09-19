SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-13-14-v-3-3-1.8.8-25.5.aarch64.rpm"
RPM_HASH = "128f40d39f8362a67fbf7dcdbae31f2071d1ac64a80fddfcd8197e44d4f611a4e2a0d1d5c9a5bed45e6d03ec5a3ae7c61ea97a2dc1bfd57f27a911902e17e319"

RPROVIDES:${PN} += "libguile-srfi-srfi-13-14-v-3-3 \
libguile-srfi-srfi-13-14-v-3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
