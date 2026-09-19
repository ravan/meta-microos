SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-ppc64le-gcc14-bootstrap-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "db78876fbe3afff3c7cee7bac62502e0f29cf5ede78a086a3367f6c990a1819a31af32dc6f17e8202d6a572de5baff14f81a839ff6dc4b1de5725d7113956e83"

RPROVIDES:${PN} += "cross-ppc64le-gcc14-bootstrap \
powerpc64le-suse-linux-gcc"

RDEPENDS:${PN} += "cross-ppc64le-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
