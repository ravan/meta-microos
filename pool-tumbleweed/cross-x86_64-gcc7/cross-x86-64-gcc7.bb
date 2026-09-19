SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-x86_64-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "92f838b750a36c45b7e333048a5b9fc6ae5fcd381e8e23ed52c6a5c62e9abc7a2491bb38bb3b04d2ff15951730ed307a0f19bd0b1f8889852d0cd7ec33256884"

RPROVIDES:${PN} += "cross-x86-64-gcc7 \
liblto-plugin.so.0 \
x86-64-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-x86-64-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
