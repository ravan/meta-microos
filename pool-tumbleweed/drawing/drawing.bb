SUMMARY = "A simple drawing application for Linux"
DESCRIPTION = "This application is a free basic image editor, similar to Microsoft Paint, is aiming at the GNOME desktop. \
 \
PNG, JPEG and BMP files are supported. \
 \
Besides GNOME, the app is well integrated in traditional-looking desktops, as well as an elementaryOS layout. \
 \
It should also be compatible with the Pinephone and Librem 5 smartphones."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "drawing-1.0.2-1.10.noarch.rpm"
RPM_HASH = "2fd67c19ee8c49ddaa96d7edabdec9ace5f30e9cb856c6d4b5d74d262e9775c25af514c1c90d4c609bf497b4853e147c46147393a7f3f3d20a3b422de3cbdbdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drawing"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3 \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-pycairo \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
