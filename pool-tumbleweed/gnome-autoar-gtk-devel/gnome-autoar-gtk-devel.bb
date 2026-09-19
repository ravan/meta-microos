SUMMARY = "Automatic archives creating and extracting library"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet. \
 \
This package brings gtk files required to develop against gnome-autoar"
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.5"

RPM_NAME = "gnome-autoar-gtk-devel-0.4.5-3.4.aarch64.rpm"
RPM_HASH = "6839506f1f62b3931c5cd720b9852116383e627d64f8cdf12e9247ec6ede9640b6ae4d74c42e60ffaa95c1c0b74b2ea779f9e8b9c2048dd222e97dd65e82c24a"

RPROVIDES:${PN} += "gnome-autoar-gtk-devel \
pkgconfig-gnome-autoar-gtk-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-autoar-devel \
libgnome-autoar-gtk-0-0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-GnomeAutoarGtk-0-1"

inherit rpm
