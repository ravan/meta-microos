SUMMARY = "Clipboard Manager Plugin for the Xfce Panel"
DESCRIPTION = "This is a clipboard manager which comes with a plugin for the Xfce Panel. It \
stores the X selection (primary and clipboard) contents even after an \
application has quit and is able to handle text and image data. Furthermore, it \
can be configured to execute arbitrary actions when the selection content \
matches specific regular expressions."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "xfce4-clipman-plugin-1.7.0-1.5.aarch64.rpm"
RPM_HASH = "2db435cee1a918f10321772a8b5fc9e8cbf5d7b1d632d263c8e24df0889556111e4775b2d525ea1b021ade9e45d75d3666557647c167f67843e3866fa28ee52d"

RPROVIDES:${PN} += "config-xfce4-clipman-plugin \
libclipman.so \
xfce4-clipman-plugin \
xfce4-panel-plugin-clipman"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libqrencode.so.4 \
libwayland-client.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
