SUMMARY = "A Real-Time Software Synthesizer That Uses Soundfont(tm)"
DESCRIPTION = "FluidSynth (formerly IIWU Synth) is a real-time software synthesizer \
based on the SoundFont(tm) 2 specifications. It can read MIDI events \
from the MIDI input device and render them to the audio device. It \
can also play MIDI files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "fluidsynth-2.6.0-2.1.aarch64.rpm"
RPM_HASH = "3073eb4061d6a299ade4adeabe2e9e3766ff778ebeedfeec45e54764eb22a6bd5d6c9372215f95e7af06c7dff4346bc1f37323f3a2eeadbb0239064a3dd47d8c"

RPROVIDES:${PN} += "fluidsynth"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libpipewire-0.3.so.0 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
