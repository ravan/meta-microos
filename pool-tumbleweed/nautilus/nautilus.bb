SUMMARY = "File Manager for the GNOME Desktop"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "50.3.1"

RPM_NAME = "nautilus-50.3.1-1.1.aarch64.rpm"
RPM_HASH = "c7d0011834ae11cee4b4b1b83e38c4ba523d8d95283f1bb833bfe0ba8defed96c3d456c6db48f7148bb208615712168e1c080df886f4c3f6807e45ef91b606dc"

RPROVIDES:${PN} += "nautilus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libcloudproviders.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libglycin-gtk4-2.so.0 \
libgmodule-2.0.so.0 \
libgnome-autoar-0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libnautilus-extension.so.4 \
libpango-1.0.so.0 \
libportal-gtk4.so.1 \
libportal.so.1 \
libselinux.so.1 \
libtinysparql-3.0.so.0 \
libwayland-client.so.0 \
localsearch"

inherit rpm
