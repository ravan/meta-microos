SUMMARY = "A library to play Commodore 64 music"
DESCRIPTION = "A library to play Commodore 64 music based on libsidplay2."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.1"

RPM_NAME = "libsidplayfp7-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "7e71818a6c5517064a91788696b5a4d7eb6fa7a60e4fb483d829b05ad154e0077fc67899bb1b9df93247220bf45e6994d1b28b59c37a5df88eaa470dfcb7c2a9"

RPROVIDES:${PN} += "libsidplayfp.so.7 \
libsidplayfp7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libresidfp.so.0 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
