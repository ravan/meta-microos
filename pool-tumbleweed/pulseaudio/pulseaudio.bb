SUMMARY = "A Networked Sound Server"
DESCRIPTION = "pulseaudio is a networked sound server for Linux, other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-17.0-7.5.aarch64.rpm"
RPM_HASH = "fb6fbecd6505b0d4d9d7ae72ed2291b754e529d20a7c2b0211418ef02a381d1fbbe25e5fc4773e4d75fcfca70cff712403e22d26223c466f5635a525cf2fdbea"

RPROVIDES:${PN} += "config-pulseaudio \
libalsa-util.so \
libcli.so \
liboss-util.so \
libprotocol-cli.so \
libprotocol-http.so \
libprotocol-native.so \
libprotocol-simple.so \
libpulsecore-17.0.so \
libpulsecore7 \
libpulsecore9 \
librtp.so \
libwebrtc-util.so \
pulseaudio \
pulseaudio-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libasound.so.2 \
libc.so.6 \
libcap.so.2 \
libdbus-1.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libltdl.so.7 \
libm.so.6 \
liborc-0-4-0 \
liborc-0.4.so.0 \
libpulse.so.0 \
libpulsecommon-17.0.so \
libsndfile.so.1 \
libsoxr.so.0 \
libspeexdsp.so.1 \
libsystemd.so.0 \
libtdb.so.1 \
libudev.so.1 \
libwebrtc-audio-processing-1.so.3 \
libxcb.so.1 \
rtkit \
udev \
user-pulse"

inherit rpm
