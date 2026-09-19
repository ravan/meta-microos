SUMMARY = "Code common for GTK3 and GTK4 backends for python313-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python313-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-gtk-common-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "00fd419d79b5d5ef38ea20f094c19801f88e2ec518d7c043c5481b9ae53264888013e43445b6d0f6937b8094d936602d285665df5bab1531083eb6449894bedb"

RPROVIDES:${PN} += "python3-matplotlib-gtk-common \
python313-matplotlib-gtk-common"

RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg \
python-abi \
python313-gobject-Gdk \
python313-gobject-cairo \
python313-matplotlib \
python313-matplotlib-cairo"

inherit rpm
