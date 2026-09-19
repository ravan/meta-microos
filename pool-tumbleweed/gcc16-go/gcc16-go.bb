SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-go-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "9c0e2ebd8049f47af1708fe9448a96d059f094dbf5043ab463034eb59eb0341b5950d173d74f2cfed12f7388ac96434ae62acc169db45a26471e84b19e81b790"

RPROVIDES:${PN} += "gcc16-go"

RDEPENDS:${PN} += "gcc16 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgo.so.25 \
libgo25 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
