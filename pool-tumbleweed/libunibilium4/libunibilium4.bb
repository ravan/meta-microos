SUMMARY = "A terminfo parsing library"
DESCRIPTION = "Unibilium is a very basic terminfo library. It doesn't depend on curses or any \
other library. It also doesn't use global variables, so it should be \
thread-safe. \
 \
This package holds the shared library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.1.2"

RPM_NAME = "libunibilium4-2.1.2-1.5.aarch64.rpm"
RPM_HASH = "2bced567d5a9cb3f01485db46e613aeb9fd8160ded3a1b030ef909e7dc96a52ae5412e009ae551cef3ea6fe523f2a7139ad2a313f5c46c82d0187da566c00c82"

RPROVIDES:${PN} += "libunibilium.so.4 \
libunibilium4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
