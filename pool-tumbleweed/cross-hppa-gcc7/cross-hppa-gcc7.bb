SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-hppa-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "e70ec06fe46d54f6afc602c0813b8622aa9838ba19844cde2b32f80658edf3723d016f2736e1eb243016086ebcd269c5d96dc9a9bfb50e1f66e55a64fd2b3457"

RPROVIDES:${PN} += "cross-hppa-gcc7 \
hppa-suse-linux-gcc \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
