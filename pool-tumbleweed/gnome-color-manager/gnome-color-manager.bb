SUMMARY = "Color management tools for GNOME"
DESCRIPTION = "GNOME Color Manager is a session framework that makes it easy to manage, \
install and generate color profiles in the GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "3.36.2"

RPM_NAME = "gnome-color-manager-3.36.2-2.4.aarch64.rpm"
RPM_HASH = "782519398236f474897abcd47528d29c1644b351f5c4b2c2474acfd12ead859f44fed1e759cd438f7ac07d44d246556337d4a4d61c7054235480274b950b3eff"

RPROVIDES:${PN} += "gnome-color-manager"

RDEPENDS:${PN} += "colord \
colord-color-profiles \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcolord.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
