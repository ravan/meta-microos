SUMMARY = "MATE Desktop Panel"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "mate-panel-1.28.1-2.14.aarch64.rpm"
RPM_HASH = "5d87845f396adea448e8603f72586ddaafb0dee5b55bd858b9a5ea3fca6ab3413a99c643de4be812a39b5fc1a35d45f89d578eca4e1fac41df195905c76ab28e"

RPROVIDES:${PN} += "mate-panel"

RDEPENDS:${PN} += "dconf-editor \
gsettings-backend-dconf \
gvfs-backends \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXrandr.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libm.so.6 \
libmate-desktop-2.so.17 \
libmate-menu.so.2 \
libmate-panel-applet-4.so.1 \
libmateweather.so.1 \
libpango-1.0.so.0 \
libwayland-client.so.0 \
libwnck-3.so.0"

inherit rpm
