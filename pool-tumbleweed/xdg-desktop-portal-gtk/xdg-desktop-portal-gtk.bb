SUMMARY = "Backend implementation for xdg-desktop-portal using GTK+"
DESCRIPTION = "A backend implementation for xdg-desktop-portal that is using GTK+ and \
various pieces of GNOME infrastructure, such as the org.gnome.Shell.Screenshot \
or org.gnome.SessionManager D-Bus interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.3"

RPM_NAME = "xdg-desktop-portal-gtk-1.15.3-1.5.aarch64.rpm"
RPM_HASH = "f72069bd8a3c2f477063ed0658dffefe45761abcbf77d41c1af86773d8f60e3259d80fcddc2dab5b8ab1a5c09f84a4e0e0e5cca9f84bb9d208dd93410efef665"

RPROVIDES:${PN} += "xdg-desktop-portal-gtk"

RDEPENDS:${PN} += "/usr/bin/sh \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
xdg-desktop-portal"

inherit rpm
