SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-ppc64le-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "563c617edef32bad2ad213bebb721688076952772f9211f0f98d64a16d4e7aaed91553ea559fb88a731e1c38e3736b5ce0cf63085ec3482e8d29ad567ac9204d"

RPROVIDES:${PN} += "cross-ppc64le-gcc14 \
powerpc64le-suse-linux-gcc"

RDEPENDS:${PN} += "cross-ppc64le-binutils \
cross-ppc64le-glibc-devel \
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
