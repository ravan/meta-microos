SUMMARY = "A spell checker and morphological analyzer library"
DESCRIPTION = "Hunspell is a spell checker and morphological analyzer library and \
program designed for languages with rich morphology and complex word \
compounding or character encoding. Hunspell interfaces: Ispell-like \
terminal interface using Curses library, Ispell pipe interface, \
LibreOffice or OpenOffice.org UNO module. \
 \
This package contains the shared library."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "libhunspell-1_7-0-1.7.2-1.14.aarch64.rpm"
RPM_HASH = "95c623f4deb3a26d204a9276d8acf9a47d1587945794af10187b13ddeec39193ab05599b6df468530463626cf27b01db46788c94ce3b05648fe9d5513dcab2e3"

RPROVIDES:${PN} += "libhunspell-1-7-0 \
libhunspell-1.7.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
