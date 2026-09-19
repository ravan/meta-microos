SUMMARY = "Core X11 protocol client library"
DESCRIPTION = "The X Window System is a network-transparent window system that was \
designed at MIT. X display servers run on computers with either \
monochrome or color bitmap display hardware. The server distributes \
user input to and accepts output requests from various client \
programs located either on the same machine or elsewhere in the \
network. Xlib is a C subroutine library that application programs \
(clients) use to interface with the window system by means of a \
stream connection."
LICENSE = "MIT"

PV = "1.8.13"

RPM_NAME = "libX11-6-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "e1f3da8f0b882819877da79cdcbae4f92e5d985a4b3d518fda62b39105cab5a560046bf7ed7971b29fb69aba30ddbd6f72879051d4e49cabd4dc9ef7a640c214"

RPROVIDES:${PN} += "libX11-6 \
libX11.so.6 \
xorg-x11-libX11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-data \
libc.so.6 \
libxcb.so.1"

inherit rpm
