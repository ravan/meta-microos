SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "16.2.0+git9497"

RPM_NAME = "libgo25-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "12d5d5d06c22d57036830d3571793e5b23f26be2460c8bfc67a2c13e3cc05f2c8a81a2e2881baf2c212e93889308a01ac3e66e7d588c923ca0667bb6d5b5032b"

RPROVIDES:${PN} += "libgo.so.25 \
libgo25"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
