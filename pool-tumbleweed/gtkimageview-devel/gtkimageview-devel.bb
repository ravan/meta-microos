SUMMARY = "Development files for gtkimageview"
DESCRIPTION = "GtkImageView is a widget that provides a zoomable and panable view of a \
GdkPixbuf. It is intended to be usable in most types of image viewing \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.6.4"

RPM_NAME = "gtkimageview-devel-1.6.4-23.10.aarch64.rpm"
RPM_HASH = "e13ce18e6c233877020de26a825b1fe521030f7791146271c3f7cda148ad45ae72e373ac7d5f4827739db73e9c240e937c8306287454dc2cd81228fac3d8e136"

RPROVIDES:${PN} += "gtkimageview-devel \
libgtkimageview-devel \
pkgconfig-gtkimageview"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-devel \
libgtkimageview0 \
pkgconfig-gtk+-2.0"

inherit rpm
