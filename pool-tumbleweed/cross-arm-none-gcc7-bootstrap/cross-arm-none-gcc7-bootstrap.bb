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

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-none-gcc7-bootstrap-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "f25e74f271c92470a7060c0f0782d184584f2272b25129404f72e822d583e47bce06aef411cb1d2d819b2793f4531c27205e0bebce47f83a3bcebfb9134a2c37"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc7-bootstrap \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
