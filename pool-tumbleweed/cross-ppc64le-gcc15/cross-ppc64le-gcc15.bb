SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-ppc64le-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "7bb3e422e0e41e00ebda20db810b1abc306538d93d572f4ab4d21d2f5a0143ff5a50611a6718412b47f235fb360edea1b2c2f3f0419f831d42854003adfac87c"

RPROVIDES:${PN} += "cross-ppc64le-gcc15 \
powerpc64le-suse-linux-gcc"

RDEPENDS:${PN} += "cross-ppc64le-binutils \
cross-ppc64le-glibc-devel \
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
