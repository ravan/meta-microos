SUMMARY = "VLC plugin for nulloy"
DESCRIPTION = "This package contains the vlc playback plugin for nulloy - a lightweight \
music player with a Waveform Progressbar."
LICENSE = "GPL-3.0-only"

PV = "0.9.9"

RPM_NAME = "nulloy-vlc-0.9.9-1.3.aarch64.rpm"
RPM_HASH = "c4e09c4abf350635f11a351e8e259c47db2bd2302982da43d941567e1f86900a08a92765f400d77d11d48ad4672c8ca708058ca18ee5474101e15a8078098774"

RPROVIDES:${PN} += "libplugin-vlc.so \
nulloy-vlc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvlc.so.5 \
nulloy"

inherit rpm
