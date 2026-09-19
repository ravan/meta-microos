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

PV = "15.3.0+git11272"

RPM_NAME = "cross-riscv64-gcc15-bootstrap-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "3c51ddb4ad4748588cc21a8829ec6d967eba3099cf1a51f781bf59941bd9de075c14d4e3741e303e8d13bd4d07354df77dd9878139240178cfca19a045702349"

RPROVIDES:${PN} += "cross-riscv64-gcc15-bootstrap \
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
