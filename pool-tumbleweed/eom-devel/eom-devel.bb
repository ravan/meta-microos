SUMMARY = "MATE Desktop graphics viewer development files"
DESCRIPTION = "The Eye of MATE is a graphics viewer for the MATE Desktop \
which uses the gdk-pixbuf library. It can deal with large images, \
and zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.1"

RPM_NAME = "eom-devel-1.28.1-1.3.aarch64.rpm"
RPM_HASH = "f20976ddbf26700fc4ebdff8bf43424019ed49d95f8d2e37fd6c8169b6bea2d0506fad51be97dcddac98b02ad0747bff87653271415ebf4e6b585e624b2d11eb"

RPROVIDES:${PN} += "eom-devel \
mate-image-viewer-devel \
pkgconfig-eom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eom \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
