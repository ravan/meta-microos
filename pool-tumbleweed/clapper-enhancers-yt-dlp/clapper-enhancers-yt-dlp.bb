SUMMARY = "Clapper Enhancer yt-dlp"
DESCRIPTION = "Stream a subset of services provided by yt-dlp within clapper"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-enhancers-yt-dlp-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "ded589e07df0af732de196ab8eb4392cdfe3ebbb307e6425604e33acd5f1e6a9189e880f2f3b40de473ccab1c8a6dd0b0c19632bedfb549ad955bc44e7825bf5"

RPROVIDES:${PN} += "clapper-enhancers-yt-dlp"

RDEPENDS:${PN} += "libpeas2-loader-python \
python3-gobject \
python3-yt-dlp \
typelib-Clapper \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gst"

inherit rpm
