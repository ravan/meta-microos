SUMMARY = "The GNU Compiler Collection targeting loongarch64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting loongarch64."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-loongarch64-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "d730f460a1f29f9114d632d4f9b0d875baf66f254eeaefcc4078bd10fce06b6edafcdeaf85751018f8b789fd6bd61d1d4124295ea2eb6f440925f48fbef909d1"

RPROVIDES:${PN} += "cross-loongarch64-gcc15 \
loongarch64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-loongarch64-binutils \
cross-loongarch64-glibc-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc15 \
libz.so.1 \
libzstd.so.1"

inherit rpm
