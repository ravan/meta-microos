SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-arm-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "b09d42f0279e93bf0033bc6dd0dbb8b0bf842613f35d7897f4aece3c14c21d8b7f264c7c841a67d626984dfea7a9aec4435cda8dfff57eb7a2f958dd8ddf8d63"

RPROVIDES:${PN} += "arm-suse-linux-gnueabi-gcc \
cross-arm-gcc14"

RDEPENDS:${PN} += "cross-arm-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
