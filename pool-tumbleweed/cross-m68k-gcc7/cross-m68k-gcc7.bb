SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-m68k-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "ee01c7956b465b6da4b3cbf020b0c5e97016260467f7962d490b2886fb4a8fe4fd6fa6e8604004fbc666c30461f1ad460af226f672ef87bcd9cd128445097801"

RPROVIDES:${PN} += "cross-m68k-gcc7 \
liblto-plugin.so.0 \
m68k-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-m68k-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
