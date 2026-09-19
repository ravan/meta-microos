SUMMARY = "Code common for GTK3 and GTK4 backends for python314-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python314-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-gtk-common-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "0de27be6d02131f11ea30ee0cfec9e43937da70591b0ef513946602d43f9748ace4e2c5bc7a290f25e698328be50f8258a6fcbe63f1b8cc479bfe98867db14fd"

RPROVIDES:${PN} += "python314-matplotlib-gtk-common"

RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg \
python-abi \
python314-gobject-Gdk \
python314-gobject-cairo \
python314-matplotlib \
python314-matplotlib-cairo"

inherit rpm
