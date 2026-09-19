SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-s390x-gcc14-bootstrap-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "97a614e2f3fe1a31e97f4b95b22488154f03cf50695e7fbcb02217890a10e0c082b15bf70e8ed85aed167b1ff52dcaf1a6f794252175b1e076be30010162b8a2"

RPROVIDES:${PN} += "cross-s390x-gcc14-bootstrap \
s390x-suse-linux-gcc"

RDEPENDS:${PN} += "cross-s390x-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
