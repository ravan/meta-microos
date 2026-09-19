SUMMARY = "Compressor with Burrows–Wheeler transform and PPM context modeling"
DESCRIPTION = "A compressor featuring improved compression ratios and performance \
over bzip2 thanks to a order-0 context mixing entropy coder, a \
Burrows-Wheeler transform code making use of suffix arrays, a RLE \
with Lempel Ziv+Prediction pass based on LZ77-style string matching \
and PPM-style context modeling."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "1.5.4"

RPM_NAME = "libbzip3-1-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "a36eb3bd6c0684274af422711fd8596c3fbe661fa90494494a26659025442c8e1d4e9cede3698a8f663948f181a82beb282697a6797de72b0431676808e9c545"

RPROVIDES:${PN} += "libbzip3-1 \
libbzip3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
