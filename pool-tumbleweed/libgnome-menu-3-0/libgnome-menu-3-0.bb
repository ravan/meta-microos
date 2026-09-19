SUMMARY = "The GNOME Desktop Menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec"
LICENSE = "LGPL-2.1-or-later"

PV = "3.38.1"

RPM_NAME = "libgnome-menu-3-0-3.38.1-1.6.aarch64.rpm"
RPM_HASH = "198a8bf0bd16410ebda5600a9b16522e3a2c4e78fadc51efc12cb6142aef9bd2b5341fa9e17f8777fe0d397ce71e703dfbef463d75423e75d02fc4a8658d3f13"

RPROVIDES:${PN} += "libgnome-menu-3-0 \
libgnome-menu-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnome-menus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
