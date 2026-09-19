SUMMARY = "A time tracker for GNOME"
DESCRIPTION = "Project Hamster is a time tracker for keeping track on how much time \
is spent during the day on activities that are set up."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "3.0.3"

RPM_NAME = "hamster-time-tracker-3.0.3-17.2.noarch.rpm"
RPM_HASH = "6c689c777d996eed8829f0ece2f80e4bf2302e07e63e09c60b833c700f7c3aca07e6b089d685c2412fd9962b8b825a3a7a30210d7c6947082f0eea1a1692c981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docky-hamster-applet \
hamster-applet \
hamster-time-tracker"

RDEPENDS:${PN} += "/usr/bin/python3 \
intltool \
python-abi \
python3-cairo \
python3-dbus-python \
python3-gobject-Gdk \
python3-pyxdg \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
