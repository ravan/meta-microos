SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc64-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "f9fc283a3101fadc4167ca1f22331b94f636146997cced1d6ba03528ba833b5d9f361dde3b06e4c3e890adbaebef6a565c2e5d5ecf8533c3055a47c6c36a4d7c"

RPROVIDES:${PN} += "cross-sparc64-gcc7 \
liblto-plugin.so.0 \
sparc64-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc64-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
