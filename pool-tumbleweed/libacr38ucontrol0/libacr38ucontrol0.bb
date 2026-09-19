SUMMARY = "Library for PC/SC IFD Handler for the ACR38 Smart Card Reader"
DESCRIPTION = "This package contains a driver for the ACR 38 smart card reader \
produced by ACS. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.11"

RPM_NAME = "libacr38ucontrol0-1.7.11-9.5.aarch64.rpm"
RPM_HASH = "affb0e60e1058c686abbfd4b09079b71ab3836fa9767ba20d768c48b1560e9269654adc13fa98bba4bb1c5124d7eedb1403d01d39c79343459e4fb344e66b5bd"

RPROVIDES:${PN} += "libacr38ucontrol.so.0 \
libacr38ucontrol0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcsclite.so.1"

inherit rpm
