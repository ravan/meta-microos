SUMMARY = "Application Finder for the Xfce Desktop Environment"
DESCRIPTION = "xfce4-appfinder is an application finder for the Xfce desktop environment. It \
is a useful program that allows you to find applications on the system and \
launch them. It provides easy keyboard navigation and can be used as a \
replacement for xfrun4."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "xfce4-appfinder-4.20.0-1.7.aarch64.rpm"
RPM_HASH = "f27830d9eadcb44bd81b30e611f335f5ff003e98b0b86b1bc083015b615bb9f9b1545da43f3a9a0b96e5b8d6b64cb087f071630bc17a779658cdb1437e3f9ece"

RPROVIDES:${PN} += "xfce4-appfinder"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgarcon-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
