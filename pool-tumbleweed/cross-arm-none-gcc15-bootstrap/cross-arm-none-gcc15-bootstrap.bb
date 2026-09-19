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

PV = "15.3.0+git11272"

RPM_NAME = "cross-arm-none-gcc15-bootstrap-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "a06ebd06f007c9a88742132d75ced0f811be7562bc33c247729cd4852e7ece258f4619117357a8506af6e52c1d9e93d5b800db2398dc9c408fcd1395c9964091"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc15-bootstrap"

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
