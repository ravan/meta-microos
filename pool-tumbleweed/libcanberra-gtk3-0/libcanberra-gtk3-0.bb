SUMMARY = "Portable sound event library -- GTK+ 3 Library"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains a library to make it easier to use \
libcanberra from GTK+ 3 applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "libcanberra-gtk3-0-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "73b30064f3dd0371d9a6eaa30cd54ff2ee9aadd22971bd173e036e1a37d51c3f64a22b202da1e0b2319fb9880e424586e07517c337c0691ad3018abe24061be4"

RPROVIDES:${PN} += "libcanberra-gtk3-0 \
libcanberra-gtk3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcanberra.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
