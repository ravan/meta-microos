SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-avr-gcc7-bootstrap-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "b9ed5ed133074764554773411d1be0fca9d0dd3c964ddda525980701af859a4d0907e816b1ef3871d75bf2722d8c50f4750ee8b245f6bb1f6ce4173e88183de5"

RPROVIDES:${PN} += "avr-gcc \
cross-avr-gcc7-bootstrap \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
