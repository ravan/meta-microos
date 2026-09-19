SUMMARY = "CompizConfig Manager Backend"
DESCRIPTION = "The backend to Compiz Config Manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python3-ccm-0.8.18-3.3.noarch.rpm"
RPM_HASH = "bc34f279b5b91dc7b10bbfeecffff0626fa607dad818586678366199bf7b66b6d98295d5f1d3aba477b31bd73b1cd74716d35291ceba23b7df3ae4f136c5aed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ccm \
python3.13dist-ccsm \
python3dist-ccsm"

RDEPENDS:${PN} += "compiz \
compizconfig-settings-manager-common \
python-abi \
python3-cairo \
python3-compizconfig \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-xml \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
