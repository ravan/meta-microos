SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-avr-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "3ee9f23ddffc609febab6ef9f5961a3303000b9ca17780a597f78aa8c0201e7d241e6c43f8b78ef8feb680fbf94b759ded123a2ed54ab7f5ec42c21ba198f2cc"

RPROVIDES:${PN} += "cross-avr-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-avr-binutils \
libc.so.6"

inherit rpm
