SUMMARY = "Gedit drawspaces plugin"
DESCRIPTION = "The gedit drawspaces plugin."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gedit-plugin-drawspaces-50.0-1.2.aarch64.rpm"
RPM_HASH = "aa6ca3601e80dfff69938056e20a7879526a224d719b9a3a3af5ee5c577ab972b621ccc4f6de47737532d8abae3510d3ca5241ddb49c56a022ec9d6ed9b99b6c"

RPROVIDES:${PN} += "gedit-plugin-drawspaces \
gedit-plugins-/usr/lib64/gedit/plugins/drawspaces.plugin \
libdrawspaces.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgedit-50.so \
libgedit-gtksourceview-300.so.5 \
libgedit-tepl-6.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1"

inherit rpm
