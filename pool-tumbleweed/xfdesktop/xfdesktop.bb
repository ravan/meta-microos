SUMMARY = "Desktop Manager for the Xfce Desktop Environment"
DESCRIPTION = "Xfdesktop is a desktop manager for the Xfce Desktop Environment which can set \
the background image, provides a right-click menu to launch applications and \
can optionally show files (including application launchers) or iconified \
windows, includes gradient support for background color, saturation support for \
background images, as well as real multiscreen and xinerama support."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "xfdesktop-4.20.2-1.3.aarch64.rpm"
RPM_HASH = "4c7a368d1d3aac40087ef8f7391a0b95e649986fe28badfff6b037d0d5e130f8fa2e354759ab8c0ded75d5872aabb100f5d1edb7b0682ba4e4697c0826fd38be"

RPROVIDES:${PN} += "xfce4-desktop \
xfdesktop"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libexo-2.so.0 \
libgarcon-1.so.0 \
libgarcon-data \
libgarcon-gtk3-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libthunarx-3.so.0 \
libxfce4kbd-private-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfce4windowing-0.so.0 \
libxfce4windowingui-0.so.0 \
libxfconf-0.so.3 \
libyaml-0.so.2 \
xfdesktop-branding"

inherit rpm
