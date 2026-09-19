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

PV = "13.5.0+git10516"

RPM_NAME = "cross-x86_64-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "7b13cab962641a202d77a054fb815fcd14ce3536ca4cfe4df9c9a60b7bcf5389c4d62dc67aecbce9182dc79128a6a8e672aaf5db9b29390891e97c6e443bfee0"

RPROVIDES:${PN} += "cross-x86-64-gcc13 \
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
