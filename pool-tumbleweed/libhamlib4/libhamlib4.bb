SUMMARY = "C interface of the Ham Radio Control Libraries"
DESCRIPTION = "Hamlib provides a programming interface for controlling radios and \
other shack hardware. It is a software layer, not a complete user \
application."
LICENSE = "LGPL-2.1-only"

PV = "4.7.2"

RPM_NAME = "libhamlib4-4.7.2-1.3.aarch64.rpm"
RPM_HASH = "f285cb6f458c0fb02262e836ca4a40005b9a6741b25c98a53789b850b5fbe9e27489e75eca73c6fb321b6f87a4c3640ec9c2a2bf76d8d48c5aba5092cd55743c"

RPROVIDES:${PN} += "libhamlib.so.4 \
libhamlib4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libusb-1.0.so.0"

inherit rpm
