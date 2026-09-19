SUMMARY = "Gesture recognition library"
DESCRIPTION = "This tree consists of an interface and tools for handling gesture \
recognition and gesture instantiation. \
The library handles tentative getures, i.e., buffering of events \
for several alternative gestures until a match is confirmed."
LICENSE = "LGPL-3.0 & GPL-3.0"

PV = "3.1.1"

RPM_NAME = "grail-3.1.1-1.34.aarch64.rpm"
RPM_HASH = "b4a351a14041208b5fe5dfe9737f903bcb14a6413c86f65d4ae5c08e5560846bd6f49718642537bf4f602234a4f173d5ff76bb04258fa42caf930fb6483091b1"

RPROVIDES:${PN} += "grail \
grail-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libc.so.6 \
libframe.so.6 \
libgrail.so.6"

inherit rpm
