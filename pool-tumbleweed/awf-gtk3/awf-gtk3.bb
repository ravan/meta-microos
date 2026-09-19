SUMMARY = "Theme preview application for GTK 3"
DESCRIPTION = "A widget factory is a theme preview application for GTK and Qt. It \
displays the various widget types in a single window allowing to see \
the visual effect of the applied theme. \
 \
This package provides the program for GTK 3."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "awf-gtk3-4.2.0-1.2.aarch64.rpm"
RPM_HASH = "e9f829aa8f95885603fd90dcdd4817afc1fa571af345d4053fa149d2643be8c122aa45ddb9278e526f33a253c40779fa30620564f533365a1b702e17a81cf9a6"

RPROVIDES:${PN} += "awf-gtk3"

RDEPENDS:${PN} += "gtk3 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify \
libnotify.so.4 \
libpango-1.0.so.0"

inherit rpm
