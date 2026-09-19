SUMMARY = "Development utilities for Microchip PIC microcontrollers"
DESCRIPTION = "This is a collection of development tools for Microchip PIC \
microcontrollers. \
 \
Gputils implements a subset of features available with Microchip's tools. \
See the documentation for an up-to-date list of what gputils can do."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "gputils-1.5.2-3.5.aarch64.rpm"
RPM_HASH = "8dbb2ca8a9c48458cb77536e96f9f5b1cffd8fa228620c966954a6694cc3fc787b31cd3c8ebdd2cb1bd27a2195ef659686ea19a367a344de726676d2b170bd6e"

RPROVIDES:${PN} += "gputils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
