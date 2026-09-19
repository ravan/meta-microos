SUMMARY = "Visual diff and merge tool"
DESCRIPTION = "Meld is a visual diff and merge tool. Two or three files can be \
compared and be edited in place. (The diffs update dynamically). Two \
or three directories can be compared and file comparisons be launched. \
The working copy directory from version control systems such as CVS, \
Subversion, Bazaar-ng and Mercurial can be browsed and viewed."
LICENSE = "GPL-2.0-or-later"

PV = "3.24.0"

RPM_NAME = "meld-3.24.0-1.2.noarch.rpm"
RPM_HASH = "81f5a43d91a794740bafbaa279e91a946e865dd073c2dfd5d5f0c548e793d4ff9412e2324c04879bde1d4f1d185f07f826ba30ee2c458eca31f8c2af6dd9004b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meld"

RDEPENDS:${PN} += "/usr/bin/python3 \
patch \
python-abi \
python3-cairo \
python3-gobject-Gdk \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango"

inherit rpm
