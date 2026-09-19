SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "libgccjit0-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "656b6a730de9e4e997fe6dd1498a9ac4761f435f58ac53b23e40eabf932df3e2d79cc66cca2e90f2e2ef6235f93d0abb7abf49881af9a60e54dd5da0de243564"

RPROVIDES:${PN} += "libgccjit.so.0 \
libgccjit0 \
libgccjit0-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcc14 \
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
