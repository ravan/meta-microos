SUMMARY = "Library for Wayland embedded compositor"
DESCRIPTION = "libwlembed is a Wayland compositor library that allows you to embed \
surfaces from one application into another by way of what's called an \
'embedded compositor'."
LICENSE = "GPL-3.0-only"

PV = "0.0.0"

RPM_NAME = "libwlembed-0-0-0.0.0-1.7.aarch64.rpm"
RPM_HASH = "4be50bf3a0a90b8f7e4c9e1e95232eba15eb8df0c697ce5ad62e32d2cd8c68772705767ee2a5786d4304f11b7071ddfa6d05707b2f2557cf06634234818f871d"

RPROVIDES:${PN} += "libwlembed-0-0 \
libwlembed-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxkbcommon.so.0"

inherit rpm
