SUMMARY = "Development utilities from the GNU C Library"
DESCRIPTION = "The glibc-utils package contains mtrace, a memory leak tracer and \
xtrace, a function call tracer which can be helpful during program \
debugging. \
 \
If you are unsure if you need this, do not install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.44"

RPM_NAME = "glibc-utils-2.44-2.1.aarch64.rpm"
RPM_HASH = "7f347c67a02a3fced1718ec1819420c5435ed53525522cf10366f27b83a51c3ca6818020298acf952554c84aaae026eb3f13f1a4526baf3f63a04822d3e0d980"

RPROVIDES:${PN} += "glibc-utils \
libmemusage.so \
libpcprofile.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
