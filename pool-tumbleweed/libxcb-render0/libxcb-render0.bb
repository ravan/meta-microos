SUMMARY = "X11 Render Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-render0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "fe1226582efe05eece8cedff2fa15038a920c30441707a91bb72518aa3834b9884c3473a15c7b49b1cb8e8dae873db6fc3fdf809dc6a63095de25fa4cc5cdb3b"

RPROVIDES:${PN} += "libxcb-render.so.0 \
libxcb-render0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
