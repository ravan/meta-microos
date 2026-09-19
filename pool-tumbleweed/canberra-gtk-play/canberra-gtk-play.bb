SUMMARY = "Utilities from libcanberra"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package provides the canberra-gtk-play utility."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "canberra-gtk-play-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "81ab23adc608f121d6438facf6299dbcb2021ec617e38e6dde0a9e1a60d2168b0c1cc3a3418b6716acd381ca9c76cd495fc42c5469bc920a8317c0fea778b95e"

RPROVIDES:${PN} += "canberra-gtk-play \
libcanberra-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
