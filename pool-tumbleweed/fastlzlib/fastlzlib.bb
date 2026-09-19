SUMMARY = "Zlib-like encapsulation interface to LZ4/FastLZ"
DESCRIPTION = "A library that bundles and wraps LZ4 and FastLZ in a zlib-like interface."
LICENSE = "BSD-2-Clause"

PV = "0.0+git.20150524"

RPM_NAME = "fastlzlib-0.0+git.20150524-3.11.aarch64.rpm"
RPM_HASH = "e5712cab5c8bbfe3c118871e5c5c34426ef22d814eb73f34355062ff655ef612b292d86ed70212f9fa6d10678df5e6e33ebbbd0354acdbc4a80f310f2543503d"

RPROVIDES:${PN} += "fastlzlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastlz.so.1"

inherit rpm
