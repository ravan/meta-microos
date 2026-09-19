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

PV = "15.3.0+git11272"

RPM_NAME = "cross-x86_64-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "40985bcdc97847cb29cc7d0c66c85991169f2ffaf0a90da26b61182daf263fc033e194cf5086c7e17ddd9ef1ec8b3962abe9d7493ad4d556cd543aa6c621a445"

RPROVIDES:${PN} += "cross-x86-64-gcc15 \
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
