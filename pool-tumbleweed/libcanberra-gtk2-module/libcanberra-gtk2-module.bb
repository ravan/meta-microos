SUMMARY = "Portable sound event library -- GTK+ 2 Module"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains a GTK+ 2 module that triggers input feedback \
event sounds."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "libcanberra-gtk2-module-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "3ee40d1f53b8953fddfa16d5121434ce7617c117c017f2171ca0f3e737c5141c0a36163d1fea5e4488ff5c74755a7530eeadc7d32a02cd8f77d219c501a9bc52"

RPROVIDES:${PN} += "libcanberra-gtk-module.so \
libcanberra-gtk2-module"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcanberra-gtk-module-common \
libcanberra-gtk.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
