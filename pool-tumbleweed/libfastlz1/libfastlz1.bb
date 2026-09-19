SUMMARY = "Zlib-like encapsulation interface to LZ4/FastLZ"
DESCRIPTION = "A library that bundles and wraps LZ4 and FastLZ in a zlib-like interface."
LICENSE = "BSD-2-Clause"

PV = "0.0+git.20150524"

RPM_NAME = "libfastlz1-0.0+git.20150524-3.11.aarch64.rpm"
RPM_HASH = "5b8d03805ea433e55c762c423d4ed317701721d0bf5580e631fa90f55cee7bb228a38727136af61e1cc3ef3fb77d79916af6a619dce13be27cc4a2d754818d9d"

RPROVIDES:${PN} += "libfastlz.so.1 \
libfastlz1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
