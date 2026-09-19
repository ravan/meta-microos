SUMMARY = "C library for encoding data in a QR Code symbol"
DESCRIPTION = "Libqrencode is a C library for encoding data in a QR Code symbol, a kind of 2D \
symbology that can be scanned by handy terminals such as a mobile phone with \
CCD. The capacity of QR Code is up to 7000 digits or 4000 characters, and is \
highly robust."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.1"

RPM_NAME = "libqrencode4-4.1.1-2.13.aarch64.rpm"
RPM_HASH = "3bc77c82fc00ac42fb7355072cd66146c66a51a08635bad5aa94a95c3f2ec365809744d383f98ebf126ca9e19bd148b9309f3fc416a0b7a486b8e3e5efa6b403"

RPROVIDES:${PN} += "libqrencode.so.4 \
libqrencode4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
