SUMMARY = "Worm Game for GNOME"
DESCRIPTION = "Nibbles is a worm game for GNOME. The player controls a 2D worm while \
trying to get food. Getting food gives points, but hitting anything \
causes a loss of points. When all points are lost, the player loses."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.2"

RPM_NAME = "gnome-nibbles-4.5.2-1.2.aarch64.rpm"
RPM_HASH = "9ccb999902e1e84645b2790bf6318d50dd9fe69138a315c6270aa4e86b5edb9ae041991fe0b047c98a16bbfc8e9d453182ae38d24a75476a8d2ecfded89212bc"

RPROVIDES:${PN} += "gnome-nibbles"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
