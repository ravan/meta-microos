SUMMARY = "Library for Near Field Communication"
DESCRIPTION = "libnfc is a low-level SDK for various RFID and NFC applications. \
 \
It supports various NFC hardware devices: dongles, flat and OEM \
devices. The library currently supports modulations for ISO/IEC 14443 \
(A and B), FeliCa, Jewel tags and Data Exchange Protocol (P2P) as \
target and as initiator."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libnfc6-1.8.0-2.6.aarch64.rpm"
RPM_HASH = "731369c504ff95ba016133d02d0756367567b31a7bd87b44c8dc1617fa054c9e1f9e9f7bc3b176fdc30704ac5ab2427d3a0bbe46ed053d8a5f1f96720ed1c412"

RPROVIDES:${PN} += "libnfc.so.6 \
libnfc6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcsclite.so.1 \
libusb-0.1.so.4"

inherit rpm
