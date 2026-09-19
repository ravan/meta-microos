SUMMARY = "Change a directory or file emblem in Nemo"
DESCRIPTION = "Change a directory or a file emblem in Nemo, the Cinnamon desktop \
file manager."
LICENSE = "GPL-3.0-only"

PV = "6.4.0"

RPM_NAME = "nemo-extension-emblems-6.4.0-6.4.noarch.rpm"
RPM_HASH = "83a25c23fadd6271feeac686c989b3aa4c4ce15a00c91664605f4a186d2eb58fccfde1636eb69d36b5c9c4c9cfa55076d59613489519b6b8325093dd1cbe8370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-emblems \
nemo-extension-emblems \
python3.13dist-nemo-emblems \
python3dist-nemo-emblems"

RDEPENDS:${PN} += "nemo \
python3-gobject \
python3-gobject-Gdk \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Nemo"

inherit rpm
