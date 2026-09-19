SUMMARY = "Screen reader for GNOME"
DESCRIPTION = "Orca is an extensible screen reader that provides access to the \
graphical desktop via user-customizable combinations of speech, \
braille, and/or magnification."
LICENSE = "LGPL-2.1-or-later"

PV = "50.2"

RPM_NAME = "orca-50.2-1.2.noarch.rpm"
RPM_HASH = "a4320afc06052910fedf95ce203b370e44d9d4ea83781a790ac4493dab1387a4a414592cdeee9f4349c439091b5f4609b3cdaa6ad641655ea9400a44df95e31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orca"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
glib2-tools \
python-abi \
python3-brlapi \
python3-dasbus \
python3-gobject \
python3-gobject-Gdk \
python3-louis \
python3-speechd \
typelib-Atk \
typelib-Atspi \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gst \
typelib-Gtk \
typelib-Spiel"

inherit rpm
