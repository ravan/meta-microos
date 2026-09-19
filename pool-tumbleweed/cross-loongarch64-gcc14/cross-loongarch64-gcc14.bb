SUMMARY = "The GNU Compiler Collection targeting loongarch64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting loongarch64."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-loongarch64-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "fc9e5d8c5f418fad1c5a73fa3098cf7188c6577bd78907fafa17683fb5e04a22e4e99367ddb4176ad3abbc3901ebe7151cb76d8df7df68edad458e406437328b"

RPROVIDES:${PN} += "cross-loongarch64-gcc14 \
loongarch64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-loongarch64-binutils \
cross-loongarch64-glibc-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc14 \
libz.so.1 \
libzstd.so.1"

inherit rpm
