SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "guile1-1.8.8-25.5.aarch64.rpm"
RPM_HASH = "da5a8986ad31c15094096d238575fc72e7286ef532d0fa9cc4417bc382889b400c4115e55629da37de92edfc6ac6ef754eb4be92ee15b7d0fbb16e22831205ee"

RPROVIDES:${PN} += "guile1"

RDEPENDS:${PN} += "/usr/bin/sh \
fileutils \
libc.so.6 \
libguile-srfi-srfi-1-v-3-3 \
libguile-srfi-srfi-13-14-v-3-3 \
libguile-srfi-srfi-4-v-3-3 \
libguile-srfi-srfi-60-v-2-2 \
libguile.so.17 \
libguile17 \
libguilereadline-v-17-17 \
sh-utils"

inherit rpm
