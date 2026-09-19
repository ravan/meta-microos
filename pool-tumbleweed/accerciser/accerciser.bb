SUMMARY = "Accessibility debugging tool"
DESCRIPTION = "Accerciser is an interactive Python accessibility explorer for the \
GNOME desktop. It uses AT-SPI to inspect and control widgets, allowing \
you to check if an application is providing correct information to \
assistive technologies and automated test frameworks. Accerciser has a \
simple plugin framework which you can use to create custom views of \
accessibility information. \
 \
In essence, Accerciser is a next generation at-poke tool."
LICENSE = "BSD-3-Clause"

PV = "3.48.0"

RPM_NAME = "accerciser-3.48.0-1.4.noarch.rpm"
RPM_HASH = "7041c3d65f41a1d2bcba23d2a63c4dbd33b337a624fc13b4ea79e3e5397917ae43028a92f8365fa580314921edf191e44960f44f22aed577add903f117bba214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accerciser"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
py3atspi \
python-abi \
python3-gobject-Gdk \
python3-python-xlib \
typelib-Atk \
typelib-Atspi \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Rsvg \
typelib-Wnck"

inherit rpm
