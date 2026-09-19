SUMMARY = "JACK support for the PulseAudio sound server"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package includes support for Jack-based applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-module-jack-17.0-7.5.aarch64.rpm"
RPM_HASH = "e195c73ab5e5f766daf8494cd44bbfc7a829f29e7921921e29c31c1123fe6cdbc9ce883d3689ee6e3f24b965e659957730417174c593743ed958fd846e40b5c9"

RPROVIDES:${PN} += "pulseaudio-module-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libjack.so.0 \
libpulsecommon-17.0.so \
libpulsecore-17.0.so \
pulseaudio"

inherit rpm
