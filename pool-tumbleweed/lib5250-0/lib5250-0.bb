SUMMARY = "Component library of the tn5250 emulator"
DESCRIPTION = "Component library of the tn5250 emulator."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.0"

RPM_NAME = "lib5250-0-0.18.0-1.4.aarch64.rpm"
RPM_HASH = "5eb05fa5ec400e91cbff40ec064eac4b88bf890b2fdfef5bebeb637647d483da69dff9b07c118c9ee5d3a71c6b544c4ae64db3d08dbc3ce40eafa0548168af41"

RPROVIDES:${PN} += "lib5250-0 \
lib5250.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
