SUMMARY = "Captive interface for public photo box"
DESCRIPTION = "Entangle provides a graphical interface for 'tethered shooting', aka \
taking photographs with a digital camera completely controlled from \
the computer. \
 \
This package provides the photobox plugin for entangle."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-plugin-photobox-3.0-3.2.aarch64.rpm"
RPM_HASH = "6a950d5d00d900c8d68783deab76ce72d12e425069c8c03c7a34bc3fbf2afcafe9eee4b1598af91f240fdee9bc2d8060cdbdee83cbf114d61675649091bd317e"

RPROVIDES:${PN} += "entangle-plugin-photobox"

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
