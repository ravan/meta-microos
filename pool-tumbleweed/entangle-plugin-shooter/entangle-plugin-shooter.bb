SUMMARY = "Repeated batch mode shooting"
DESCRIPTION = "Entangle provides a graphical interface for 'tethered shooting', aka \
taking photographs with a digital camera completely controlled from \
the computer. \
 \
This package provides the shooter plugin for entangle."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-plugin-shooter-3.0-3.2.aarch64.rpm"
RPM_HASH = "15b1c19e8fc0d63fbb83e7e74256c774fd8f78165210edb5a09848f649c800966392e313bfa49ede80d9e1f07ebacea0609e8aa4686b8be30890fba7276e7e0f"

RPROVIDES:${PN} += "entangle-plugin-shooter"

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
