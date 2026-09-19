SUMMARY = "Desktop menu editor"
DESCRIPTION = "A desktop menu editor. Budgie, Cinnamon, GNOME, KDE (Plasma), LXDE, LXQt, MATE, \
Pantheon, Unity, and Xfce are supported."
LICENSE = "GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "menulibre-2.4.0-1.4.noarch.rpm"
RPM_HASH = "b0650ebc2e559598abd3ed31156bd1b7c6e7ae4b9ccc7991769edc653acff4149d197fc59917a7627cce37832e0d6d7d043ac2f18c0a96a5ec8544a14862c1c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "menulibre \
python3.13dist-menulibre \
python3dist-menulibre"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gnome-menus \
hicolor-icon-theme \
python-abi \
python3-gobject \
python3-psutil \
typelib-GLib \
typelib-GMenu \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
xdg-utils"

inherit rpm
