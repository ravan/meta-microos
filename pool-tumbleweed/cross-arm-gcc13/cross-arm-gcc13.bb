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

PV = "13.5.0+git10516"

RPM_NAME = "cross-arm-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "1f0e7b3c7589a5c93a6ec714c650dc876580e670d1bb8013ff9befd4079c241aa6132b22ce0852d9f2dcd6866a0572ed30da390f096b475b2c761d5102b2a408"

RPROVIDES:${PN} += "arm-suse-linux-gnueabi-gcc \
cross-arm-gcc13"

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
