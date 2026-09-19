SUMMARY = "A Desktop Wiki"
DESCRIPTION = "Zim is a graphical text editor used to maintain a collection of wiki \
pages. Each page can contain links to other pages, simple formatting and \
images. Pages are stored in a folder structure, like in an outliner, and \
can have attachments. Creating a new page is as easy as linking to a \
nonexistent page. All data is stored in plain text files with wiki \
formatting. Various plugins provide additional functionality, like a \
task list manager, an equation editor, a tray icon, and support for \
version control."
LICENSE = "GPL-2.0-or-later"

PV = "0.77.2"

RPM_NAME = "zim-0.77.2-1.1.noarch.rpm"
RPM_HASH = "44b0388fa068b00018e0d4335f8398cfe05dbbe68306a5ba456023b7f02be0f6bd4fce2c1e436b2da5bd5db4c82071708dbb56228b29c4964ea6e3597cae94bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-zim \
python3dist-zim \
zim"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-gobject-Gdk \
python3-pyxdg \
typelib-1-0-Gtk-3-0 \
xdg-utils"

inherit rpm
