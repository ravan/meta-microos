SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-go-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "0ca121bc318440204d4f8d3a3b189c7fb7766e80d443a7657ce1f06cc55231adb6b6f9a1965263e2e6c55b3b647bfda39941b2bd81ff52872b5670c6583d5cc8"

RPROVIDES:${PN} += "gcc13-go"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgo.so.22 \
libgo22 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
