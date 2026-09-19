SUMMARY = "The GNU Compiler Collection targeting loongarch64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting loongarch64."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-loongarch64-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "5fd4dc525a1ece346b86a4e6c1e25f6a125cd1c715e04e25621e45548c5679ad6b3c77494e7e4d91376bd257b35e7c952cbed2da52ff372c5d16d8f6796ede2e"

RPROVIDES:${PN} += "cross-loongarch64-gcc16 \
loongarch64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-loongarch64-binutils \
cross-loongarch64-glibc-devel \
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
