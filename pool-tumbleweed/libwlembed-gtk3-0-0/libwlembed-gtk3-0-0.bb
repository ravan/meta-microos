SUMMARY = "Library for Wayland embedded compositor"
DESCRIPTION = "libwlembed is a Wayland compositor library that allows you to embed \
surfaces from one application into another by way of what's called an \
'embedded compositor'."
LICENSE = "GPL-3.0-only"

PV = "0.0.0"

RPM_NAME = "libwlembed-gtk3-0-0-0.0.0-1.7.aarch64.rpm"
RPM_HASH = "546dbf5f75161869e96ab041d065691c24a9a70faded8eadd1d2f99f73fc11560fb206375aae9ca67137cb7c2fa2664fc15ff414bf3b089a2518043d409c9420"

RPROVIDES:${PN} += "libwlembed-gtk3-0-0 \
libwlembed-gtk3-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libwlembed-0.so.0"

inherit rpm
