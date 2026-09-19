SUMMARY = "Simple yet full-featured LaTeX editor for GTK/GNOME"
DESCRIPTION = "Setzer is an easy to use yet full-featured LaTeX editor for the GNU/Linux \
desktop, written in Python with Gtk."
LICENSE = "GPL-3.0-or-later"

PV = "66"

RPM_NAME = "Setzer-66-2.3.noarch.rpm"
RPM_HASH = "4b8cabb0a683fbe93e5bfd8c2b4049f704927bd61f131e4f8d741a7f06f1264f05b6b6bd66d64b7bf6166e69f6901f021f749ae46a8049660d007edc9ae21c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Setzer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-bibtexparser \
python3-cairo \
python3-gobject-Gdk \
python3-pexpect \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango \
typelib-PangoCairo \
typelib-Poppler \
typelib-WebKit \
typelib-Xdp"

inherit rpm
