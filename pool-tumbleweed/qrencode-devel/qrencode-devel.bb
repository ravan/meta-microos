SUMMARY = "C library for encoding data in a QR Code symbol - Development files"
DESCRIPTION = "Libqrencode is a C library for encoding data in a QR Code symbol, a kind of 2D \
symbology that can be scanned by handy terminals such as a mobile phone with \
CCD. The capacity of QR Code is up to 7000 digits or 4000 characters, and is \
highly robust. \
 \
This package contains the development files for libqrencode."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.1"

RPM_NAME = "qrencode-devel-4.1.1-2.13.aarch64.rpm"
RPM_HASH = "d4b2876d53fd1b940851eb20942c9c6401402482cada76be843033e82d763a8a9352649c2973e93fa4aafdd960003f4b58923bfe0d7e49c662b8a8bde43a712f"

RPROVIDES:${PN} += "pkgconfig-libqrencode \
qrencode-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqrencode4"

inherit rpm
