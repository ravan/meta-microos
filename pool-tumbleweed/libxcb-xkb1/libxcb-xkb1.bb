SUMMARY = "X11 Keyboard Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xkb extends the ability to control the keyboard \
over what is offered by the X Window System core protocol."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-xkb1-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "9327cb093bfab2a2b4d169c4c340ee682607c575213610f7481350bd08c43870fe0d661c6555ab35ead773f0fd04497c7ca2a753f0dbdf0ab3c7d3ea68c973af"

RPROVIDES:${PN} += "libxcb-xkb.so.1 \
libxcb-xkb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
