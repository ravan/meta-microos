SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-pru-gcc15-bootstrap-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "ca5d9c53cbdf28e9fadcad575fc2ba3bd81d48aca05688daf8971e0748ddf50ee9abd29aa3272ceaab6d9f9109e8312b51b75a5204dce8981a7b8758e32a9b9d"

RPROVIDES:${PN} += "cross-pru-gcc15-bootstrap \
pru-gcc"

RDEPENDS:${PN} += "cross-pru-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
