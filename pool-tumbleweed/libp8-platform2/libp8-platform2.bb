SUMMARY = "Platform support library used by libCEC and binary add-ons for Kodi"
DESCRIPTION = "Platform support library used by libCEC and binary add-ons for Kodi."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "libp8-platform2-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "3d98a3881bf97608ad31cc46516a410dfa8388f7a2ebc74034b8e52c9facdd959b3cbf3547889d65778842fbeddd9c2f855d805d7d85b0ede09e52d1356f9c2c"

RPROVIDES:${PN} += "libp8-platform.so.2 \
libp8-platform2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
