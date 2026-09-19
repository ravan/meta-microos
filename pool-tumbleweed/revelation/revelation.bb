SUMMARY = "Password manager for GNOME"
DESCRIPTION = "Revelation is a password manager. It organizes accounts in \
a tree structure, and stores them as AES-encrypted XML files."
LICENSE = "GPL-2.0-only"

PV = "0.5.6"

RPM_NAME = "revelation-0.5.6-1.3.noarch.rpm"
RPM_HASH = "876e533fdd543645d218e7a325beccdf05b421a00005a6c5444fe9c8e6ab9946d8c724ac728d48627e89cacbcea3dcb75bc4bc50a29b56f00bcb5185eb4645a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "revelation"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject \
python3-gobject-Gdk \
python3-pwquality \
python3-pycryptodomex \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango"

inherit rpm
