SUMMARY = "User profile configuration utility"
DESCRIPTION = "Mugshot is a user configuration utility that allows \
updating personal user details and avatar."
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "mugshot-0.4.3-3.3.noarch.rpm"
RPM_HASH = "6c3443fff70d96e0b0e6a5ac6aaea1063f04728261dde0b73ea79c259d994f42aede120c79e9f86910c108544e1bde450c12ce1ad63be71101f936e9d80a872d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mugshot \
python3.13dist-mugshot \
python3dist-mugshot"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
python-abi \
python3 \
python3-base \
python3-cairo \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-pexpect \
typelib-Cheese \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-Gtk \
typelib-GtkClutter"

inherit rpm
