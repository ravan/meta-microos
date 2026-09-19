SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguilereadline-v-17-17-1.8.8-25.5.aarch64.rpm"
RPM_HASH = "048208a44ad430e74da644078a684821d0e61fc0566563751ee098a88eb98847ce7afb4a179a50f29e8502634c40f999892bc65d7476acf9ee75eeaeb8f71175"

RPROVIDES:${PN} += "libguilereadline-v-17-17 \
libguilereadline-v-17.so.17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile.so.17 \
libreadline.so.8"

inherit rpm
