SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-ppc64le-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "7ccae0349ce0af4c077810b2530f35afc3e3c8f9dc2a964f6c4e6c431f532a5f97883770c0b4145f7e6a22274624b7e5e814815c4d5fe39e0136b6f62d2a5d54"

RPROVIDES:${PN} += "cross-ppc64le-gcc13 \
powerpc64le-suse-linux-gcc"

RDEPENDS:${PN} += "cross-ppc64le-binutils \
cross-ppc64le-glibc-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
