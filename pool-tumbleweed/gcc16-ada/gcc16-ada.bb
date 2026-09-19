SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-ada-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "18acf098d70c56f5df4b3a411f1e2a6efdf4bdc849f81ea66162228ef49eee931c2f58d16d07ca377c33effb18c2b899cda8feab0b6e4e9decba23b549376cf9"

RPROVIDES:${PN} += "gcc16-ada"

RDEPENDS:${PN} += "gcc16 \
ld-linux-aarch64.so.1 \
libada16 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
