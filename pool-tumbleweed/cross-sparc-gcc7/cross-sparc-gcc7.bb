SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "e8d2c8b5a6cebda5438cdf52012b5f18fcdbe34c19c4b3ca0b785738ad90a104b8a7569ff8a48406727c130b14c2180fce6a42d47b941b2734a64b1d96d9d228"

RPROVIDES:${PN} += "cross-sparc-gcc7 \
liblto-plugin.so.0 \
sparc-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
