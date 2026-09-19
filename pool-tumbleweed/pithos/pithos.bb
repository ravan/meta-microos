SUMMARY = "Native Pandora Radio client for Linux"
DESCRIPTION = "Pithos is a native Pandora Radio client for Linux. It's much more \
lightweight than the Pandora.com web client, and integrates with desktop \
features such as media keys, notifications, and the sound menu."
LICENSE = "GPL-3.0-only"

PV = "1.6.2"

RPM_NAME = "pithos-1.6.2-1.1.noarch.rpm"
RPM_HASH = "e03021838b88f2d2b8562c059fc3f1b8021f17be60772430f2506af9a1af7e405b7b489e320cd3032c11dbda3f331ce027166e21705ff8be52144803eb75392a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pithos"

RDEPENDS:${PN} += "/usr/bin/env \
gstreamer-plugins-bad \
gstreamer-plugins-good \
python3-cairo \
python3-gobject-Gdk \
typelib-Dbusmenu \
typelib-DbusmenuGtk3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstPbutils \
typelib-Gtk \
typelib-Keybinder \
typelib-Pango \
typelib-Secret"

inherit rpm
