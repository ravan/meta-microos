SUMMARY = "SGPIO captive backplane tool"
DESCRIPTION = "Serial General Purpose Input Output (SGPIO) is a communication method used \
between a main board and a variety of internal and external hard disk drive \
bay enclosures. This utility can be used to control LEDs in an enclosure. \
For more information about SGPIO, please consult the  SFF-8485 \
Specification."
LICENSE = "GPL-2.0+"

PV = "1.2.1"

RPM_NAME = "sgpio-1.2.1-26.9.aarch64.rpm"
RPM_HASH = "ff043efa6ab841e46669c2210fd8442f33cebb58a086df2e846894defcc4af5fce849320ec91bf95f9e86e5d2d565ce1a0f3ab3746e775021dc20f366b9541ae"

RPROVIDES:${PN} += "sgpio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
