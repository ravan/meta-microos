SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64le-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "9bf34e8f82046a4081935df9321a79b7c913d320913dd5fb43730b1e85a6f60fd0e12b31dba5aa377f117f6f7809b474c12f26a175b95460f3b13fd23efaf92a"

RPROVIDES:${PN} += "cross-ppc64le-gcc7 \
liblto-plugin.so.0 \
powerpc64le-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64le-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
