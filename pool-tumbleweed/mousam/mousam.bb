SUMMARY = "A lightweight weather app"
DESCRIPTION = "Mousam is a lightweight weather app. It has the following features: \
*	Real-time temperature, humidity, wind speed, UV index, pressure and more \
*	Provide hourly forecasts for the next 24 hours \
*	Also shows tomorrow and 7-day forcasts \
*	Supports metric or imperial systems"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "mousam-2.0.2-1.2.noarch.rpm"
RPM_HASH = "b317bfe8769579705258232dbfc07eeca6a5a3fec7a3df8b11f4b25b7d4e7dcf7c5103c9780f1f819662bda49907393cad6fa9c2aa2505340dc285bfc753cecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mousam"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk"

inherit rpm
