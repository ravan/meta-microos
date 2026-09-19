SUMMARY = "JBIG1 lossless image compression tools"
DESCRIPTION = "The jbigkit package contains tools for converting between PBM and JBIG1 \
formats."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "jbigkit-2.1-5.11.aarch64.rpm"
RPM_HASH = "2afbc3f763eac04357317c01e685a336606b57ccffeedc5fa7580b613a030265b797774d3cefa66eef7f34778bd8869b1f224a8ea2c25bfeb4733f15fc4f03a1"

RPROVIDES:${PN} += "jbigkit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjbig.so.2 \
libjbig85.so.2"

inherit rpm
