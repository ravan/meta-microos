SUMMARY = "Development files for eog, an image viewer"
DESCRIPTION = "Eye of GNOME (eog) is a simple graphics viewer for the GNOME desktop \
which uses the gdk-pixbuf library. \
 \
This subpackage contains all the necessary files and documentation for \
developing eog plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "50.3"

RPM_NAME = "eog-devel-50.3-1.1.aarch64.rpm"
RPM_HASH = "0399b75fe4a83b420c20bb373a6e907a604aff791a517516cde7e88a9e02a96b3134a039c32aa4d0ec6b464f45b8d54b487c563731517d51834cd48b83053618"

RPROVIDES:${PN} += "eog-devel \
pkgconfig-eog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eog \
pkgconfig-gtk+-3.0 \
pkgconfig-libhandy-1"

inherit rpm
