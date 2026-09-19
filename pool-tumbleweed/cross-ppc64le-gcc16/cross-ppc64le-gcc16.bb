SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-ppc64le-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "ebc2eeb8647ce65eadda06fb12d109815e494ae8c9dd5d558da4a0c5c0ab10724994f6ccb360d11f3a356ce983909093f16c9354335cb828c5e80442340c9a11"

RPROVIDES:${PN} += "cross-ppc64le-gcc16 \
powerpc64le-suse-linux-gcc"

RDEPENDS:${PN} += "cross-ppc64le-binutils \
cross-ppc64le-glibc-devel \
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
