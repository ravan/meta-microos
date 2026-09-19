SUMMARY = "PC/SC IFD Handler for the Reiner SCT Cyberjack USB-SmartCard Readers"
DESCRIPTION = "This package includes the PC/SC IFD handler for the Reiner SCT \
Cyberjack pinpad/e-com/RFID USB chipcard readers. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.99.5final.SP17"

RPM_NAME = "pcsc-cyberjack-3.99.5final.SP17-1.3.aarch64.rpm"
RPM_HASH = "df16e6695c267c5374dea4bd383c62f028e4603ef904c726abb41eaeae8263ca0fd829e20d4f9733b86fe730b5377763a1c228d469c78aff75fe1e1144a8cc40"

RPROVIDES:${PN} += "config-pcsc-cyberjack \
libifd-cyberjack.so.6 \
pcsc-cyberjack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
pcsc-lite"

inherit rpm
