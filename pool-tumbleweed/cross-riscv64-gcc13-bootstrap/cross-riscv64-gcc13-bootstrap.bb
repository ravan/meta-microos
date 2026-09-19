SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-riscv64-gcc13-bootstrap-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "a199670648a5aaf5203ee87b80ed602c40ec2995ba196559dc677f404daa518360a896beb488f94ca4d12da9bfec947ad2cef5e1805fd5c1d9cbe183cd2adb18"

RPROVIDES:${PN} += "cross-riscv64-gcc13-bootstrap \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-riscv64-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
