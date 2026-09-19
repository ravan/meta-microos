SUMMARY = "Genealogical Research Software"
DESCRIPTION = "Gramps gives you the ability to record the many details of an \
individual's life as well as the complex relationships between \
various people, places and events. All of your research is kept \
organized, searchable and as precise as you need it to be."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.8"

RPM_NAME = "gramps-6.0.8-1.2.noarch.rpm"
RPM_HASH = "f70fdfa5697f89e036db61f11bf57dde20dc5b58e10303d0fa8b7268b9029150f7010fea5f624eb28c389199453e4d5fb18ccdc13be869e047422d18dc92451f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gramps \
python3.13dist-gramps \
python3dist-gramps"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-bsddb3 \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-orjson \
typelib-GExiv2 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GeocodeGlib \
typelib-Gio \
typelib-Gspell \
typelib-Gtk \
typelib-OsmGpsMap \
typelib-Pango \
typelib-PangoCairo \
xdg-utils"

inherit rpm
