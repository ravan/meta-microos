SUMMARY = "X11 DPMS Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-dpms0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "691f6a99d26ed4c7d4f3956b7617f6ed1b9fca90009f3fc10d5c2977205ae16cfe032a61ee9a52225edc44439ec5d058c1cdc921c08ab0011b6ffda32fcd74aa"

RPROVIDES:${PN} += "libxcb-dpms.so.0 \
libxcb-dpms0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
