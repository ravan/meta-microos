SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-ada-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "f1c7b8e2d6d439e3c00440e081e2d4a94e8e2ee12a84378dfc7c9838a9516c7af9e7ef0b397a739882a6ce9b0d40d388f95cd4fac40245d82cc2f68023664edc"

RPROVIDES:${PN} += "gcc15-ada"

RDEPENDS:${PN} += "gcc15 \
ld-linux-aarch64.so.1 \
libada15 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
