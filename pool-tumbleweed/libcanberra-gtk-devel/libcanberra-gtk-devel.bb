SUMMARY = "GTK+ 2 development files for libcanberra"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package provides the development files for libcanberra-gtk2."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "libcanberra-gtk-devel-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "d4d960f345c93821b62cac222feb8029ec09ed99d74df9a0ed10e274d964ca51b43426fbc7fab0d831498cc5d63c4a82d8dc98d3c6fd203c94f7de1357e57e37"

RPROVIDES:${PN} += "libcanberra-gtk-devel \
pkgconfig-libcanberra-gtk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcanberra-devel \
libcanberra-gtk0 \
libcanberra0 \
pkgconfig-gdk-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-libcanberra"

inherit rpm
