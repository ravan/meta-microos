SUMMARY = "A JPEG-LS library"
DESCRIPTION = "An optimized implementation of the JPEG-LS standard for lossless and \
near-lossless image compression. JPEG-LS is a low-complexity standard that \
matches JPEG 2000 compression ratios. In terms of speed, CharLS outperforms \
open source and commercial JPEG LS implementations."
LICENSE = "BSD-3-Clause"

PV = "2.4.2"

RPM_NAME = "libcharls2-2.4.2-1.11.aarch64.rpm"
RPM_HASH = "24f6fd3d9e3f2cf5175ce952b85c6aa4a13d961c7fb06a5ae9e1936310e65e06399b3903510687275e2ccfeb5914fb76603b0a639e1dba0ca033b6055d059217"

RPROVIDES:${PN} += "libcharls.so.2 \
libcharls2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
