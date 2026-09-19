SUMMARY = "GTK+ 3 development files for libcanberra"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package provides the development files for libcanberra-gtk3."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "libcanberra-gtk3-devel-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "df71a80fcb4a7c4a483d599602fa1ec6978428c38b08a1376daef200dcd594c2974d0557b755eeb67083ad24ae0cc12d33a770e13f6872a5bde064b2beda24b7"

RPROVIDES:${PN} += "libcanberra-gtk3-devel \
pkgconfig-libcanberra-gtk3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcanberra-devel \
libcanberra-gtk3-0 \
libcanberra0 \
pkgconfig-gdk-3.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libcanberra"

inherit rpm
