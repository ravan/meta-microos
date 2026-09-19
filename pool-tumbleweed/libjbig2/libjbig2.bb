SUMMARY = "JBIG1 lossless image compression library"
DESCRIPTION = "JBIG-KIT provides a portable library of compression and decompression \
functions with a documented interface that you can include very easily \
into your image or document processing software. In addition, JBIG-KIT \
provides ready-to-use compression and decompression programs with a \
simple command line interface (similar to the converters found in \
netpbm). \
 \
JBIG-KIT implements the specification: \
    ISO/IEC 11544:1993 and ITU-T Recommendation T.82(1993): \
     Information technology — Coded representation of picture and audio \
     information — Progressive bi-level image compression \
 \
which is commonly referred to as the “JBIG1 standard”"
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "libjbig2-2.1-5.11.aarch64.rpm"
RPM_HASH = "cf2c70241bbe39a7714cab88abbc2135aa1601366937286294136193a346938d36536fa8bf6615fb61a6717dac366177a37bfa4f4e847dfce12fb1fc964c2d9e"

RPROVIDES:${PN} += "libjbig \
libjbig.so.2 \
libjbig2 \
libjbig85.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
