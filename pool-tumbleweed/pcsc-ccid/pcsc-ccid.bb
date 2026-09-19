SUMMARY = "PCSC Driver for CCID Based Smart Card Readers and GemPC Twin Serial Reader"
DESCRIPTION = "This package contains a generic USB CCID (Chip/Smart Card Interface \
Devices) driver. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.3"

RPM_NAME = "pcsc-ccid-1.8.3-1.1.aarch64.rpm"
RPM_HASH = "6c8a3ab988697db071250c0518d915ce981113c4c566bfd5b1295b17529445c82a03fa04912262c268ba4a68946f2b676eaf808de0685e11f7302f807361f2aa"

RPROVIDES:${PN} += "config-pcsc-ccid \
libccid.so \
libccidtwin.so \
pcsc-ccid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
pcsc-lite"

inherit rpm
