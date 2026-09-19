SUMMARY = "Qt 6 NFC library"
DESCRIPTION = "Provides access to NFC hardware."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Nfc6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "c71fb2c395fc58f20aecec040f2d16e8e72d01cfbcd3a77f33223393f682ed1e1037ab3f368d10371d8885e9847030f090c5536c4d08e884b4ff740871eee5ef"

RPROVIDES:${PN} += "libQt6Nfc.so.6 \
libQt6Nfc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libpcsclite.so.1 \
libstdc++.so.6"

inherit rpm
