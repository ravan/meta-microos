SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-ada-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "71d149144dfc14d041916d7beb98ab1598894ce8fcf3d707e82d8ada49de8dd0116714f15fb45b001a2d5a66e0c746a19b7f2ab160e7137c5fc74107ac0c7658"

RPROVIDES:${PN} += "gcc13-ada"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libada13 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
