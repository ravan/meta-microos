SUMMARY = "Widgets Library for the Xfce Desktop Environment"
DESCRIPTION = "The libxfce4ui library provides a number of widgets commonly used by Xfce \
applications. This package provides the GTK 3 variant of libxfce4ui."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "libxfce4ui-2-0-4.20.2-1.5.aarch64.rpm"
RPM_HASH = "9b889f02f96fb30832bb0a3d17d652c3ccffa86afad3ca1fadb227caf72312c3e7c340ca80f2370b6ecadbc60da989c95cb6642cf1172943c322bc96ab4f2059"

RPROVIDES:${PN} += "libxfce4ui-2-0 \
libxfce4ui-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
exo-tools \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstartup-notification-1.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
