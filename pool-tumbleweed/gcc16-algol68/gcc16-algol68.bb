SUMMARY = "GNU GCC Algol 68 Compiler"
DESCRIPTION = "This package contains an Algol 68 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-algol68-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "a6cf12209b5574007d50cbc3c59563997983c03a36a8f5e4a19232fdfc0bf9e6d563a33cafbd17eda54f52470c7f7d06e27100f661b5ee962339f031a48f81e6"

RPROVIDES:${PN} += "gcc16-algol68"

RDEPENDS:${PN} += "gcc16 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libga68-2 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
