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

PV = "15.3.0+git11272"

RPM_NAME = "cross-avr-gcc15-bootstrap-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "95fbd90dc7cd8d3a8a42fa29a51049dcb6d73d336f13481f729b5c70709d612119be1c13084aa55f509a9c6cb6b01d31c265f26af3e816e81d8e6b78b476d164"

RPROVIDES:${PN} += "avr-gcc \
cross-avr-gcc15-bootstrap"

RDEPENDS:${PN} += "cross-avr-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
