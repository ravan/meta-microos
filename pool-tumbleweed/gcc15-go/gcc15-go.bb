SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-go-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "f555c4b1b79221866b0778dc7ff9aaaf42968aafa0326b10f1c967b729978fbd6ff3807e29f14da048635f5fff5c3f55b7ed05c1ef93163fb75c38564277c751"

RPROVIDES:${PN} += "gcc15-go"

RDEPENDS:${PN} += "gcc15 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgo.so.24 \
libgo24 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
