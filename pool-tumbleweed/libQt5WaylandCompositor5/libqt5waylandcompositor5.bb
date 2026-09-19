SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde55"

RPM_NAME = "libQt5WaylandCompositor5-5.15.19+kde55-1.2.aarch64.rpm"
RPM_HASH = "6caf3d6cee410c6e5431909f724b7ebdc96e53b426cd8fe27301aca853fc56093a9d72048b6e55bd71d1f1e80c94128233d5fb01fb47db784d5868a50defc82d"

RPROVIDES:${PN} += "libQt5WaylandCompositor.so.5 \
libQt5WaylandCompositor5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-server.so.0 \
libxkbcommon.so.0"

inherit rpm
