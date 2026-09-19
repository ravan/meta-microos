SUMMARY = "Gedit wordcompletion plugin"
DESCRIPTION = "The gedit wordcompletion plugin"
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gedit-plugin-wordcompletion-50.0-1.2.aarch64.rpm"
RPM_HASH = "4f4a55f9cca8f9b85659ce779e004326b0d8380c1519c6ece5a55deaa35834ee7678eb30af1780d2b00ea3f3ec3033e1b8fa77b02c2235b71c0b57a3f95b1f6d"

RPROVIDES:${PN} += "gedit-plugin-wordcompletion \
gedit-plugins-/usr/lib64/gedit/plugins/wordcompletion.plugin \
libwordcompletion.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgedit-50.so \
libgedit-gtksourceview-300.so.5 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1"

inherit rpm
