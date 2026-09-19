SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-4-v-3-3-1.8.8-25.5.aarch64.rpm"
RPM_HASH = "b3eaba673c556febf5ae1177fa2507d4966721f07a739c3c67cf46a2cd9622aa79e16e8114e47a5e60aa3e7048569c29e88971ffbe3a22972374a55ec3f0aaca"

RPROVIDES:${PN} += "libguile-srfi-srfi-4-v-3-3 \
libguile-srfi-srfi-4-v-3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
