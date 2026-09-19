SUMMARY = "Listen to different sounds"
DESCRIPTION = "Improve focus and increase your productivity by listening to different sounds. \
Or allows you to fall asleep in a noisy environment."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "blanket-0.8.0-1.5.noarch.rpm"
RPM_HASH = "589840cbd0f8f6e540ebf7c72ca6b38ad774c3704885190b7fe4be9d6ccf498d2fad430d5f479b67f8aa1a07ed1dccbcc1c43dbffd69fb6c0aff4cda8a222937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blanket"

RDEPENDS:${PN} += "/usr/bin/python3 \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gst \
typelib-GstPlay \
typelib-Gtk"

inherit rpm
