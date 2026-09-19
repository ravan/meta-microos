SUMMARY = "Utility for Optimizing JPEG Files"
DESCRIPTION = "jpegoptim is a utility for optimizing JPEG files. It provides lossless \
optimization (based on optimizing the Huffman tables) and 'lossy' optimization \
based on setting a maximum quality factor."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "jpegoptim-1.5.6-1.4.aarch64.rpm"
RPM_HASH = "524b2bcf1087d91ddf8e7af87c68f5facf154bb66f261ab6a5229e38e7f3d3502e75c20d14a76ab48922319b503188d6ede1f5e7040398de1f7ef7ea46d1010c"

RPROVIDES:${PN} += "jpegoptim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8"

inherit rpm
