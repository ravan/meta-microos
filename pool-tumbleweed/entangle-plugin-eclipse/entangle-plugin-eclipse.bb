SUMMARY = "Eclipse totality automated capture for corona"
DESCRIPTION = "Entangle provides a graphical interface for 'tethered shooting', aka \
taking photographs with a digital camera completely controlled from \
the computer. \
 \
This package provides the eclipse plugin for entangle."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-plugin-eclipse-3.0-3.2.aarch64.rpm"
RPM_HASH = "da80ee9971aba279cb9b10f23cb1c216ba268232373857c5efa0fc64541b2ad46ffbc5b1e432d251d4d527c2352111d55f05a19fe567cfbdf1d4b813b8cc0e8e"

RPROVIDES:${PN} += "entangle-plugin-eclipse"

RDEPENDS:${PN} += "entangle \
python3 \
python3-gobject \
python3-gobject-Gdk \
typelib-Entangle \
typelib-GExiv2 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-GstBase \
typelib-Gtk \
typelib-Peas \
typelib-PeasGtk"

inherit rpm
