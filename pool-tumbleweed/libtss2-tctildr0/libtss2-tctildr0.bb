SUMMARY = "TCTI interface loading library"
DESCRIPTION = "This is a helper library that simplifies loading other tcti libraries. It is \
recommended over custom tcti loading code in applications."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-tctildr0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "fdf1cad01ec07a11f727d7f1b999a4a64cebe73ded72fcefc681db80b7d425ac2d87894f495e93d7ec5b3b6356ae71716b8b96efe235123e79c397bf7b861210"

RPROVIDES:${PN} += "libtss2-tctildr.so.0 \
libtss2-tctildr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
