SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-mips-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "41fb1a89831c21297cf1cb237b98e25b9a594ed54dc3b8ebb3d6365b099a9e967458edef43d69df8481ed9108935a33f48cf2d26f0a51775c0f19d8d8e0c3a59"

RPROVIDES:${PN} += "cross-mips-gcc7 \
liblto-plugin.so.0 \
mips-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-mips-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
