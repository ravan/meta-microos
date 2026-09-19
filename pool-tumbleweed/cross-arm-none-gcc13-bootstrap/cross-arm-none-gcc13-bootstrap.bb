SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-arm-none-gcc13-bootstrap-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "0573872d530df19bdee12addb977422c3d477a525e77809a494376c4915aa79159712549578a9104d93dadedde9be9c325a2b16ebc24a00213a812a7b153340b"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13-bootstrap"

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
