SUMMARY = "Music Player for GNOME"
DESCRIPTION = "Music player and management application for GNOME."
LICENSE = "LGPL-2.1-or-later & SUSE-GPL-2.0-with-plugin-exception"

PV = "50.0"

RPM_NAME = "gnome-music-50.0-2.1.noarch.rpm"
RPM_HASH = "94d4400f891a3663c3558ff4b3a7952969f78e3951edca3501120c29abd1c6c32641692a0f37719ee24e012c0f3af0e07b3446c8a288f86a2fafb84654e2d1cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-music"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
dbus-1-python3 \
grilo-plugin-tracker \
localsearch \
python-abi \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-requests \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Grl \
typelib-Gsk \
typelib-Gst \
typelib-GstAudio \
typelib-GstPbutils \
typelib-GstTag \
typelib-Gtk \
typelib-MediaArt \
typelib-Soup \
typelib-Tracker \
typelib-Tsparql"

inherit rpm
