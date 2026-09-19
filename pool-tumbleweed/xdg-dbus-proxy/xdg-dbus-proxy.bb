SUMMARY = "Filtering proxy for D-Bus connections"
DESCRIPTION = "xdg-dbus-proxy is a filtering proxy for D-Bus connections. It was \
originally part of the flatpak project, but it has been broken out \
as a standalone module to facilitate using it in other contexts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.8"

RPM_NAME = "xdg-dbus-proxy-0.1.8-1.1.aarch64.rpm"
RPM_HASH = "07ab28dd8aad61fab067642c931ca1e4b0ed7332b0f9cabd2c9059e69a88cac91e1558ce374db9585a20a423c0cd68eadc5fb044beaf8274a23e32a8c52ca7a1"

RPROVIDES:${PN} += "xdg-dbus-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
