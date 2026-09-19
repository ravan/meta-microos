SUMMARY = "A Network Traffic Analyser"
DESCRIPTION = "Wireshark is a network protocol analyzer. It allows examining data \
from a live network or from a capture file on disk."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.6.8"

RPM_NAME = "wireshark-devel-4.6.8-2.1.aarch64.rpm"
RPM_HASH = "e67afbaa720ce948c7b12d61cf270b6ad76471c5649070e02db1ed7b0c7869b46fdb75926121365170ca102cfaf18f49f4231c61e6ef93f784302405e84139f6"

RPROVIDES:${PN} += "cmake-Wireshark \
pkgconfig-wireshark \
wireshark-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
glibc-devel \
libwireshark19 \
libwiretap16 \
libwsutil17 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gthread-2.0 \
wireshark"

inherit rpm
