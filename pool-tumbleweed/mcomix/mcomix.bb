SUMMARY = "Comics Viewer"
DESCRIPTION = "Comics Viewer forked from comix."
LICENSE = "GPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "mcomix-3.2.0-1.1.noarch.rpm"
RPM_HASH = "e065d61284d74bce9d745961f21ea4b667991fc2d0615e2f9c20e01b4f99b05aa84b30e390f80d40a22966591f0489f48f6991b4ae59a04a95701326e3151412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mcomix \
python3.13dist-mcomix \
python3dist-mcomix"

RDEPENDS:${PN} += "/usr/bin/7z \
/usr/bin/python3.13 \
python-abi \
python3 \
python3-Pillow \
python3-chardet \
python3-gobject-Gdk \
python3-pycairo \
typelib-1-0-Gtk-3-0 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
