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

PV = "15.3.0+git11272"

RPM_NAME = "cross-arm-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "28e09f12f905aa4b7957b676411e92cac511b18dc33eeb0781030d6fa6efa49783e39c288e1bca1e4ad87a4fa23c9c10741a402726d7e0684d814e1cce09012b"

RPROVIDES:${PN} += "arm-suse-linux-gnueabi-gcc \
cross-arm-gcc15"

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
