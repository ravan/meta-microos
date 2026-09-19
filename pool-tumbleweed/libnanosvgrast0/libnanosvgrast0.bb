SUMMARY = "Simple SVG parse"
DESCRIPTION = "Shared library built from the code in the nanosvgrast. header file \
 \
Provides functions to rasterize SVG image, \
returns RGBA image (non-premultiplied alpha)"
LICENSE = "Zlib"

PV = "2022.12.22"

RPM_NAME = "libnanosvgrast0-2022.12.22-1.12.aarch64.rpm"
RPM_HASH = "6c45d354770c2d114d2408ddc4d945ed2e71f0ded902663290d88ae95cbc5f26c6be9c5c7ad0e7baef2d9dd5e2171ad618e023c0bf66fccd472f0140929785c2"

RPROVIDES:${PN} += "libnanosvgrast.so.0 \
libnanosvgrast0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
