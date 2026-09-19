SUMMARY = "X11 Xfixes Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Fixes extension provides applications with work-arounds for \
various limitations in the core protocol."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-xfixes0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "5a4daf90d11d9fae2a99949da9b208324d50b3130cfc88d513495d935997479b2da94ab03ea56b4ecbd0dc67935fa480579530ea3b1f2c335bce901217652252"

RPROVIDES:${PN} += "libxcb-xfixes.so.0 \
libxcb-xfixes0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
