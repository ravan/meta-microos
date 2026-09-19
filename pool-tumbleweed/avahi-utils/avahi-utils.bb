SUMMARY = "Command Line Utilities for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-utils-0.8-45.2.aarch64.rpm"
RPM_HASH = "84ebe00cfb486763c88d9d0f74f604115cdbe17d57b430ebd40d2ecfcfcdd8b4d4bb2808b3d149cef280263af96567c43049d777b6aa89bd241f5e79cab07d03"

RPROVIDES:${PN} += "avahi-utils"

RDEPENDS:${PN} += "avahi \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgdbm.so.6"

inherit rpm
