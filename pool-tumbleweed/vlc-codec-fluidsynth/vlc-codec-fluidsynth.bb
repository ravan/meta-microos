SUMMARY = "FluidSynth integration for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
using FluidSynth as a backend to play MIDI files. \
 \
Note that FluidSynth plugin is known to cause strange crashes here \
and there."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.23"

RPM_NAME = "vlc-codec-fluidsynth-3.0.23-7.12.aarch64.rpm"
RPM_HASH = "1766f11f5b18aa0a38f04191f986766affa8dcd90508d0c54ce61c471acecb0036cf1c092ce43b90c88e81a0c75e69aef3bd612167379d85c8d805e4ffd7017d"

RPROVIDES:${PN} += "libfluidsynth-plugin.so \
vlc-codec-fluidsynth"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfluidsynth.so.3 \
libvlccore.so.9 \
vlc-noX"

inherit rpm
