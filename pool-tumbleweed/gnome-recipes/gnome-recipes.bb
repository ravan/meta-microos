SUMMARY = "A recipe app for GNOME"
DESCRIPTION = "GNOME Recipes is an easy-to-use application that will help you to discover what to cook \
today, tomorrow, rest of the week and for your special occasions. \
 \
Recipes comes with a collection of recipes that have been collected by GNOME contributors \
from all over the world. It also lets you store your own recipes, and share them with your \
friends."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4+117"

RPM_NAME = "gnome-recipes-2.0.4+117-3.6.aarch64.rpm"
RPM_HASH = "b25a16346318b08c9a70d568fa98a4d3ad6cae7427017383a397a475260c3cf4770c2d574d0488c66b055481ca584e2a0f84b48c80c2f8524d26bdfc522eeb1b"

RPROVIDES:${PN} += "gnome-recipes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-autoar-0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.3 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librest-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
