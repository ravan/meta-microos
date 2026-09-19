SUMMARY = "Pulseaudio Plug-In for ALSA Library"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the polypaudio I/O plug-in for ALSA library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-pulse-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "03a22e44dbec2a91daf1e0d129e3d166337056c372881c828b29e7815e78abf2c8a66b3de0978651b3e57bfe5788f15e5b432a1e8e790f21f99f85e8c931bd78"

RPROVIDES:${PN} += "alsa-plugins-pulse \
libasound-module-conf-pulse.so \
libasound-module-ctl-pulse.so \
libasound-module-pcm-pulse.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libpulse.so.0 \
pulseaudio-daemon"

inherit rpm
