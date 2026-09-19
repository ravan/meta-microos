SUMMARY = "Portable sound event library -- GTK+ 3 Module"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains a GTK+ 3 module that triggers input feedback \
event sounds."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "libcanberra-gtk3-module-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "488982724b4c4b360822f325a3708818737ccab2f6263f9a3dba39a70585441d2dd7bbd6d46d9cf7c672b6a0663f57a4d07ae0a16c1df2453e478d667b140be8"

RPROVIDES:${PN} += "libcanberra-gtk3-module \
libcanberra-gtk3-module.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcanberra-gtk-module-common \
libcanberra-gtk3.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
