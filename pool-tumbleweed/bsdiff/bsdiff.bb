SUMMARY = "Tools for binary file patches"
DESCRIPTION = "bsdiff and bspatch are tools for building and applying patches to \
binary files. By using suffix sorting (specifically, Larsson and \
Sadakane's qsufsort) and taking advantage of how executable files \
change, bsdiff routinely produces binary patches 50-80% smaller \
than those produced by Xdelta, and 15% smaller than those produced \
by .RTPatch."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "bsdiff-4.3-6.11.aarch64.rpm"
RPM_HASH = "0bc67c891e52e7680e3a1d6b79e07fdd616c1025ffdb992d0c2f3a6146326a5359594b496fc3ab27569ea4063f1d336f376d06b425083477fe78c0b64c3089f4"

RPROVIDES:${PN} += "bsdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6"

inherit rpm
