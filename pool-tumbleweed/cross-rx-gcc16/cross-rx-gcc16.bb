SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-rx-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "1c6331a9e4dc23494dd27315fc763370b70ff5eec4375054b856025efa4a545d6f1e20710cae22dc17dc691486f5321a6d46e7001d186157d456895a382351aa"

RPROVIDES:${PN} += "cross-rx-gcc16 \
rx-elf-gcc"

RDEPENDS:${PN} += "cross-rx-binutils \
cross-rx-newlib-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
