SUMMARY = "Utility to take pictures of your screen"
DESCRIPTION = "The screenshot tool captures the screen, a window, or an user-defined \
area and save the snapshot image to a file."
LICENSE = "GPL-2.0-or-later"

PV = "41.0"

RPM_NAME = "gnome-screenshot-41.0-2.18.aarch64.rpm"
RPM_HASH = "c0d46984880d6b9c70ab80dc8e4c564516890e1d780a060e3fd5231da7cd9364709124df72993a6df560fdd58d164fc594df81c0c5735debf90710f7d197f4aa"

RPROVIDES:${PN} += "gnome-screenshot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0"

inherit rpm
