SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "libgccjit0-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "220ea5e23a6974d7b61c2676cd5a8440db763233d3537fe158d83ddb8bfecabd316cb3cd1485e2c2aaf196dc0d3ad8c3c2c1c3af63987f0aebf3030a4281ffd9"

RPROVIDES:${PN} += "libgccjit.so.0 \
libgccjit0 \
libgccjit0-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcc15 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
