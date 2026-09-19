SUMMARY = "Gstreamer plugin for nulloy"
DESCRIPTION = "This package contains the gstreamer playback plugin for nulloy - a lightweight \
music player with a Waveform Progressbar."
LICENSE = "GPL-3.0-only"

PV = "0.9.9"

RPM_NAME = "nulloy-gstreamer-0.9.9-1.3.aarch64.rpm"
RPM_HASH = "ebd174a4796aaf9b275afce08603a506699dc83f75e793f31ee3074cb2f6ba70b72584196a9fb5533cad2aa5b1d17da4b14f1407b016dbbbebccff821e834f9e"

RPROVIDES:${PN} += "libplugin-gstreamer.so \
nulloy-gstreamer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libstdc++.so.6 \
nulloy"

inherit rpm
