SUMMARY = "Gobject introspected access to libproxy"
DESCRIPTION = "Libproxy is using gobject-introspection and is thus usable \
from a wide range of programming languages."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.5.12"

RPM_NAME = "typelib-1_0-Libproxy-1_0-0.5.12-2.4.aarch64.rpm"
RPM_HASH = "3e82088d766ef4ca7faced7da300a9cbfb77e5b5b8554b3457368a1bebd08191e51cf092c9981f4536951e85a86819133b443b205e529ebcbb6a9164af5ec4dc"

RPROVIDES:${PN} += "typelib-1-0-Libproxy-1-0 \
typelib-Libproxy"

RDEPENDS:${PN} += "libproxy.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
