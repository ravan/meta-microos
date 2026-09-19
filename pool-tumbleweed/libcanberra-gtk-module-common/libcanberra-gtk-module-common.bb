SUMMARY = "Portable sound event library -- Common Files for GTK+ Modules"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains files common to both the GTK+ 2 and GTK+ 3 \
modules."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "libcanberra-gtk-module-common-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "ffce13050c65e23e593cadcacc25dc8f132266f47ce6673c2de8aa17746bade32792443f5a748803919460d7ba114be51332ad0d38f395f9f5180239bc2320df"

RPROVIDES:${PN} += "libcanberra-gtk-module-common"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra.so.0 \
libudev.so.1"

inherit rpm
