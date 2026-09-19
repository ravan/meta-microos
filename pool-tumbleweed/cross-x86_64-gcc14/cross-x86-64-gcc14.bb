SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-x86_64-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "fc0d513c982f2ec580ca77d09274ddfa2cae4d157417702f9e6ab3451102569fa34484347891ae8bd4aaf83ccb1e12936758f0e4af251575eeac0268ea7c3f6d"

RPROVIDES:${PN} += "cross-x86-64-gcc14 \
x86-64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-x86-64-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
