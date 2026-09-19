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

PV = "13.5.0+git10516"

RPM_NAME = "cross-ppc64le-gcc13-bootstrap-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "413d0660154ad1e6bbff9d1ef074b2003b0b66030b28d06d25f301db6865b672b93da0cc1e6a255981cc7082f99617093ff91a39a81b2b61bbb8dafba512423d"

RPROVIDES:${PN} += "cross-ppc64le-gcc13-bootstrap \
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
