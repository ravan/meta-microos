SUMMARY = "Sound Recorder"
DESCRIPTION = "A simple, modern sound recorder."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "43.beta+131"

RPM_NAME = "vocalis-43.beta+131-1.2.noarch.rpm"
RPM_HASH = "de00f578c9679db78a4261d64c3fe4b5c1513a86932a4eee0c3ffc01e7b0e64c064b833a347c0c5939a5cbbaf34d5eaca3e4ca1499c1ee4915f21bc3de1cca3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-sound-recorder \
vocalis"

RDEPENDS:${PN} += "/usr/bin/gjs-console \
gstreamer-plugins-base \
gstreamer-plugins-good \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gst \
typelib-GstPbutils \
typelib-GstPlayer \
typelib-Gtk"

inherit rpm
