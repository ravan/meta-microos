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

PV = "14.4.0+git12698"

RPM_NAME = "cross-arm-none-gcc14-bootstrap-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "42534edbcff055f347bcaf1df1661b0ad011dab06c153b9bdcb04533288bdd801f46685381c774527e21e369b16f76edf6f5d444f8b89f6223968a492d8bfd76"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc14-bootstrap"

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
