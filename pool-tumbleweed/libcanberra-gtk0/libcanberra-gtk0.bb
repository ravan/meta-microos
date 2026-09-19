SUMMARY = "Portable sound event library -- GTK+ 2 Library"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains a library to make it easier to use \
libcanberra from GTK+ 2 applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "libcanberra-gtk0-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "360a0070bb963f7433c7fbac0fd740e6c67fe501622f44092feb1b0c39feb38e084900a106c1fcc3b092fbe8ffa7fce243b633c3b33fe2273e627d3dbd130881"

RPROVIDES:${PN} += "libcanberra-gtk.so.0 \
libcanberra-gtk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcanberra.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
