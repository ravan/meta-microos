SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-gobject0-0.8-45.2.aarch64.rpm"
RPM_HASH = "fbab887e46dd0ce3af46e49304feb4dad7b01226734e0210ca39f6a57fba1777c0deddd524e25159d7791a0d797d3680dd0e92bbe80ea2ed324f2a675e5648e1"

RPROVIDES:${PN} += "libavahi-gobject.so.0 \
libavahi-gobject0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
