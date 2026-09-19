SUMMARY = "Library files for pantheon-wayland"
DESCRIPTION = "Library files for pantheon-wayland."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "libpantheon-wayland1-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "c50af7c18f736030caf3d8d9964010d311471060fb1d6b881f7cafd41246ab4ea2b89283191449fe6679b8c1d7dc6f698da10ba5aa5096c2f21dee7056737d55"

RPROVIDES:${PN} += "libpantheon-wayland.so.1 \
libpantheon-wayland1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libwayland-client.so.0"

inherit rpm
