SUMMARY = "A Wikipedia reader for the GNOME Desktop"
DESCRIPTION = "Wike is a Wikipedia reader for the GNOME Desktop. Provides access to all the \
content of this online encyclopedia in a native application, with a simpler and \
distraction-free view of articles."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "wike-3.2.1-1.2.noarch.rpm"
RPM_HASH = "7dd0b1c987288b24ce11a497dbdbe3ed127e49a82dd3d99a735f0c2a6b698c01d6c725f5795b3ddfa0f511481f75c1333ed89362f88e4d46f1c2acfe1d86bb13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wike"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-gobject-Gdk \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Soup \
typelib-WebKit"

inherit rpm
