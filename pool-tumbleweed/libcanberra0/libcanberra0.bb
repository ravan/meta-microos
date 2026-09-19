SUMMARY = "Portable sound event library"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains the main library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "libcanberra0-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "1b42f1bd7ff3c4645b01095e7166c5ac6621567dd4a06d05ab91d569826baf400bd91e56378e1d1cf9960022bcc6ce856e205db491e9586feaf078d5fb63a1ba"

RPROVIDES:${PN} += "libcanberra-alsa.so \
libcanberra-multi.so \
libcanberra-null.so \
libcanberra-pulse.so \
libcanberra.so.0 \
libcanberra0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libltdl.so.7 \
libpulse.so.0 \
libpulse0 \
libvorbisfile.so.3"

inherit rpm
