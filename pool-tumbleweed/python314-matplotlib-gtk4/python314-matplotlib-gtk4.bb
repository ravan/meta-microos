SUMMARY = "GTK4 backends for python314-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python314-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-gtk4-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "0017026e9da3d50df20d76ee653e7c63eecf2b772c486e01be975490242eac0af66263fef8d76c464195ccad5c12d82d47efbeefe856c5da68e21ed488a5e6f5"

RPROVIDES:${PN} += "python314-matplotlib-gtk4"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-matplotlib-gtk-common"

inherit rpm
