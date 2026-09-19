SUMMARY = "A screen-cast tool to show keys"
DESCRIPTION = "A screencast tool to show keys. Inspired by Screenflick and based on \
the key-mon project."
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "screenkey-1.5-1.17.noarch.rpm"
RPM_HASH = "62afff97cb03f20360ca0a7f188c2c410fd29ef0d225eb42ab64bfd05c9f501bfe6610b6f5031d1606b2320badda7df01a73d4feceb9238d697ae4c2d05a3bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-screenkey \
python3dist-screenkey \
screenkey"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3 \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-pycairo \
slop \
typelib-Gtk"

inherit rpm
