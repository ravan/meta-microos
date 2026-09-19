SUMMARY = "Maps Application for GNOME"
DESCRIPTION = "Maps is a maps application for GNOME 3. It allows viewing street maps from \
OpenStreetMaps and satellite imagery from Mapbox. You can also get directions \
for your journeys, whether on foot, by bike, or by car."
LICENSE = "Apache-2.0 & CC-BY-3.0 & GPL-2.0-or-later & BSD-3-Clause & ISC & MIT"

PV = "50.5"

RPM_NAME = "gnome-maps-50.5-1.1.aarch64.rpm"
RPM_HASH = "1ad52381f646a9db4f817e70c1c43ae6af327fb9d57d761c1cc6355c04bd4e824fa4ab29f91e02b85eb5163461c777f5dfaa757e058e393bf39bfb960c5523f0"

RPROVIDES:${PN} += "gnome-maps \
libgnome-maps.so.0 \
typelib-GnomeMaps"

RDEPENDS:${PN} += "/usr/bin/gjs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2 \
libshumate-1.0.so.1 \
libxml2.so.16 \
typelib-Adw \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GWeather \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Geoclue \
typelib-GeocodeGlib \
typelib-Gio \
typelib-GioUnix \
typelib-GnomeMaps \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-Rest \
typelib-Secret \
typelib-Shumate \
typelib-Soup \
typelib-Xdp \
typelib-cairo \
typelib-freetype2"

inherit rpm
