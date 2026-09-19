SUMMARY = "X11 module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides the components needed to automatically start \
the PulseAudio sound server on X11 startup."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-module-x11-17.0-7.5.aarch64.rpm"
RPM_HASH = "0a0d12799da9f95dbcb2e47598d959de7b7a1fa9d6bf8530a7c720748bfb844da172bc6e9c6922cdc9086f207855b0789c4b83a1862e9961f2fe0a26922484c2"

RPROVIDES:${PN} += "pulseaudio-module-x11"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libprotocol-native.so \
libpulse.so.0 \
libpulsecommon-17.0.so \
libpulsecore-17.0.so \
libxcb.so.1 \
pulseaudio \
pulseaudio-utils"

inherit rpm
