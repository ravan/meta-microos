SUMMARY = "Plugin SVT-AV1 encoder for AVIF"
DESCRIPTION = "This plugin provides the SVT-AV1 encoder for AVIF to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "libheif-svtenc-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "a07ad3fced491e6ca97f508937ec48f92e9c8c523f0e572c06f480a880a9368e494f2f18e179aa9bce262322a2d36b354be4e49ba2e9d5861d77744b6186d613"

RPROVIDES:${PN} += "libheif-svtenc \
libheif-svtenc.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSvtAv1Enc.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
libheif1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
