SUMMARY = "Places Menu Plugin for the Xfce Panel"
DESCRIPTION = "The Places plugin provides a menu with quick access to folders, \
documents, and removable media."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "xfce4-places-plugin-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "f684fe5e8252daa2d15cb5897ce4949c74d556e1720e88a28f5ef82b85f3c74f318de44bbc8cc083b907a44edd1762662211b84e9b77f74251b476cb332687c9"

RPROVIDES:${PN} += "libplaces.so \
xfce4-panel-plugin-places \
xfce4-places-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
