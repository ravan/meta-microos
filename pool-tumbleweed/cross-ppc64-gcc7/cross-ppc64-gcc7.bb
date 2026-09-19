SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "6f9194201a9d6ecf84a95d1648d57a5426dc5bc47ba853d31d3aff3b54dbcd26a8672b1cf525314c7550cfd3461aa92a9586308305824d3e17933f1afe63e35e"

RPROVIDES:${PN} += "cross-ppc64-gcc7 \
liblto-plugin.so.0 \
powerpc64-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
