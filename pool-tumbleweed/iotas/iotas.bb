SUMMARY = "Distraction-free note taking app with optional cloud sync"
DESCRIPTION = "Iotas is a simple note taking with mobile-first design and optional speedy \
Nextcloud Notes sync."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.7"

RPM_NAME = "iotas-0.12.7-1.2.noarch.rpm"
RPM_HASH = "8ff8512063269ba66ad5e3ab0d891c472df0f6c327dc15bc55b7aa5a9a2b88129e9f14cb5e3f3c70ccef567b859544f063cfde59ac6976e68d143b08b18884f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iotas"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject-Gdk \
python3-linkify-it-py \
python3-markdown-it-py \
python3-packaging \
python3-pygtkspellcheck \
python3-urllib3 \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Graphene \
typelib-Gtk \
typelib-GtkSource \
typelib-JavaScriptCore \
typelib-Pango \
typelib-Secret \
typelib-WebKit"

inherit rpm
