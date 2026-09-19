SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-go-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "5c49d8fd66ea9ff621a53068b308e2e2dacf912422a8d83774f9a3e211c4861ca64dbbc8500c9fbb94153f6809baec70a82f5022546b6ebee0261d5095386512"

RPROVIDES:${PN} += "gcc14-go"

RDEPENDS:${PN} += "gcc14 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgo.so.23 \
libgo23 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
