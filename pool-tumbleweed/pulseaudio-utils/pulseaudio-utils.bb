SUMMARY = "PulseAudio utilities"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides utilies for making use of the PulseAudio sound \
server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-utils-17.0-7.5.aarch64.rpm"
RPM_HASH = "12784255af7dccaba30aaab616a5f438faa6b601213715fa1d865d295fad5c15b45f567abae61ee326ee9e0e5343668669c296d883bd5e74067cb87e4196fe59"

RPROVIDES:${PN} += "libpulsedsp.so \
pulseaudio-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse-mainloop-glib0 \
libpulse.so.0 \
libpulse0 \
libpulsecommon-17.0.so \
libsndfile.so.1 \
libxcb.so.1 \
pulseaudio-daemon"

inherit rpm
