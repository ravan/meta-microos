SUMMARY = "Tray icon to manage Compiz"
DESCRIPTION = "This package provides a tray icon that allows you to easily enable, \
disable and restart Compiz, and change the currently used window \
manager and/or window decorator."
LICENSE = "GPL-2.0+"

PV = "0.2.4"

RPM_NAME = "fusion-icon-0.2.4-1.30.noarch.rpm"
RPM_HASH = "7ac24620256dc00f6ade9340127a5001189acaaecedf5957d6f649109bf9823992725d98cd46ce31eeccd67610290a1969fb38864723a851e638399a98a87dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fusion-icon \
python3.13dist-fusion-icon \
python3dist-fusion-icon"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
Mesa-demo-x \
python-abi \
python3-compizconfig \
python3-gobject \
python3-gobject-Gdk \
python3-qt5 \
typelib-AppIndicator3 \
typelib-Gdk \
typelib-Gtk \
xvinfo"

inherit rpm
