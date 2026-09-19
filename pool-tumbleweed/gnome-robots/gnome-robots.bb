SUMMARY = "Robots Game for GNOME"
DESCRIPTION = "Robots is a graphical version of the original text based robots game, \
which can be found on a number of UNIX systems. The player must outwit \
the robots chasing him/her by getting them to run into each other."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-robots-50.0-1.6.aarch64.rpm"
RPM_HASH = "7e36d9e48eb6a7e228c1083965a227000ac2d27ca9f05d7c47151c540d86cf248ac923ca7397bccb26da8898a1ae44fbaf1c9ee91ff3c0ebf41d4144ecfb6662"

RPROVIDES:${PN} += "gnome-robots"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libglycin-gtk4-2.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
