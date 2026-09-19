SUMMARY = "Experimental X11 compatibility layer for Wayland"
DESCRIPTION = "Wayback is an experimental X compatibility layer which allows for \
running full X desktop environments using Wayland components. It is \
essentially a stub compositor which provides just enough Wayland \
capabilities to host a rootful Xwayland server (no other Wayland \
applications)."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "wayback-0.3-2.3.aarch64.rpm"
RPM_HASH = "b4605414b25213221331ed7897a8e18dbb60756953139e88dfee373370775fdef8eb556052aac91b63de9ae19c67d02377ee9b788586f8efb8bd8e36e1cac175"

RPROVIDES:${PN} += "wayback"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libwlroots-0.20.so \
libxkbcommon.so.0 \
xwayland"

inherit rpm
