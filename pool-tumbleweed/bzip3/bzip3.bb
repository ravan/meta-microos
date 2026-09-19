SUMMARY = "Compressor with Burrows–Wheeler transform and PPM context modeling"
DESCRIPTION = "A compressor featuring improved compression ratios and performance \
over bzip2 thanks to a order-0 context mixing entropy coder, a \
Burrows-Wheeler transform code making use of suffix arrays, a RLE \
with Lempel Ziv+Prediction pass based on LZ77-style string matching \
and PPM-style context modeling. \
 \
bzip3 1.4.0 can outperform zstd 1.5.5 on specific data sets, e.g. \
15% better ratio for same compress time on source code, but has \
time trouble with e.g. object files."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "1.5.4"

RPM_NAME = "bzip3-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "fa7609debc3818cb2099e2625802bbcf7cf1b5105cf8e8b418dca6f37f2c1732928a4fce6cbe431cc5b5a2fad41aec737396b446c68087403948b4eadf63fb22"

RPROVIDES:${PN} += "bzip3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbzip3.so.1 \
libc.so.6"

inherit rpm
