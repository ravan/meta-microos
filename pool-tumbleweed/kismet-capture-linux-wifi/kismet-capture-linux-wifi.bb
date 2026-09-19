SUMMARY = "Kismet Linux WiFi capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet Linux WiFi capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-linux-wifi-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "f773b01d1226a33a1f3f12c4ad76a5c5d463dbfc988a5fed3200c6f029cbfc7ee1eb0570290892eafac288e5e0dc8d90d604823ab3e53686f23bde1f2444671d"

RPROVIDES:${PN} += "kismet-capture-linux-wifi"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kismet \
kismet-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libgobject-2.0.so.0 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnm.so.0 \
libpcap.so.1 \
libwebsockets.so.22 \
permissions"

inherit rpm
