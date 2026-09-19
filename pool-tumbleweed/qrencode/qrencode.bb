SUMMARY = "C library for encoding data in a QR Code symbol"
DESCRIPTION = "Libqrencode is a C library for encoding data in a QR Code symbol, a kind of 2D \
symbology that can be scanned by handy terminals such as a mobile phone with \
CCD. The capacity of QR Code is up to 7000 digits or 4000 characters, and is \
highly robust."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.1"

RPM_NAME = "qrencode-4.1.1-2.13.aarch64.rpm"
RPM_HASH = "dae8a9c7856547c03f594e9e588d4a9ff173ab99c1f02ba90c171fccc79a893a1169c7a4509315c93f3fcc74311687ba58e07a1a21bad675ed7cf0730d224cb7"

RPROVIDES:${PN} += "qrencode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
libqrencode.so.4"

inherit rpm
