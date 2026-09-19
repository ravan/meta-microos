SUMMARY = "Tools for Managing Xfce Settings"
DESCRIPTION = "This package provides a number of tools for managing settings in the Xfce \
desktop environment."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.20.5"

RPM_NAME = "xfce4-settings-4.20.5-1.1.aarch64.rpm"
RPM_HASH = "b2ea3154b128b4497929343cbf34cb70d6fcd801840d1444fc7aea68a6ce75eed71d545c3ad90975172e491abd92eaf1441f60d471f028194bf0b6e67c3a03c7"

RPROVIDES:${PN} += "libxfsettingsd-gtk-settings-sync.so \
xfce-mcs-manager \
xfce-mcs-plugins \
xfce4-settings"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXi.so.6 \
libXrandr.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libexo-2.so.0 \
libfontconfig.so.1 \
libgarcon-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libxfce4kbd-private-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
libxklavier.so.16 \
xfce4-settings-branding"

inherit rpm
