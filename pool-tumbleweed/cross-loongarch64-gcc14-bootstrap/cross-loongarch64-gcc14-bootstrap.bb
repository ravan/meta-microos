SUMMARY = "The GNU Compiler Collection targeting loongarch64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting loongarch64. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-loongarch64-gcc14-bootstrap-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "a82416addd6cc5393fd6c16823fc287efa7e9c617d56ed4b9845a2166cf61ab5d4ea3ed09694fd0b3e3311c0a99284d6c31c69cea1d76971e32f0a78db8b5353"

RPROVIDES:${PN} += "cross-loongarch64-gcc14-bootstrap \
loongarch64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-loongarch64-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
