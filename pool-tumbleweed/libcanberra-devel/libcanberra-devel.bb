SUMMARY = "Development files for libcanberra, a portable sound event library"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package provides the development files for libcanberra."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "libcanberra-devel-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "8f0d4388ddd4c5cf69f457876935364003f9ff5e78a3f146f171b0a58ff209b50f5c57ad019406a929e2c87758fb17a83a8656935990b1060d0c6ce12dd08190"

RPROVIDES:${PN} += "libcanberra-devel \
pkgconfig-libcanberra"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcanberra0"

inherit rpm
