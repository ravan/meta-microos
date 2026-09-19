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

PV = "14.4.0+git12698"

RPM_NAME = "cross-avr-gcc14-bootstrap-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "fd3fbb91d1ec6c194e7b9c630bbfa901229b51754c225107bbf456a81f3f55876d2867af916872b1a5ce8fc26994018f0ac1863d53b25c67e9ae2d0e0ad69498"

RPROVIDES:${PN} += "avr-gcc \
cross-avr-gcc14-bootstrap"

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
