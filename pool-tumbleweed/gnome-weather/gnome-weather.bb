SUMMARY = "Weather App for GNOME"
DESCRIPTION = "GNOME 3 weather app that does: \
 \
  * Display current conditions; \
  * Display forecasts; \
  * Show radar maps; \
  * Notify on hazardous weather conditions."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-weather-50.0-1.2.noarch.rpm"
RPM_HASH = "d81f44f316b8b884983457ce5a7c39556367990f15fa5d0af159d4e9898039ca036b8663bb48c04dd9a769a3301228834ac87ccbb6d250f82ae148c95663b109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-weather"

RDEPENDS:${PN} += "/usr/bin/gjs-console \
typelib-Adw \
typelib-GObject \
typelib-GWeather \
typelib-Gdk \
typelib-Geoclue \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk"

inherit rpm
