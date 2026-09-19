SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "libgccjit0-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "9c0715b72398f330754a3148d033ed302fa68220c0f86e0b92089b6071977ba0a9c00ba4ab5f5e606569542ff0d84722dff97ec32feb9a06b3092139aac14455"

RPROVIDES:${PN} += "libgccjit.so.0 \
libgccjit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcc16 \
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
