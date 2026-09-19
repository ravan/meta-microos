SUMMARY = "An Audio/MIDI multi-track sequencer"
DESCRIPTION = "Qtractor is an Audio/MIDI multi-track sequencer application \
written in C++ around the Qt6 toolkit. \
 \
The initial target platform will be Linux, where the Jack Audio \
Connection Kit (JACK) for audio, and the Advanced Linux Sound \
Architecture (ALSA) for MIDI, are the main infrastructures to \
evolve as a fairly-featured Linux Desktop Audio Workstation GUI, \
specially dedicated to the personal home-studio."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.12"

RPM_NAME = "qtractor-1.5.12-1.3.aarch64.rpm"
RPM_HASH = "073b9481f3450a06165d4a39a420b011a758888adc12268d171085df10d77409542bb9be115539080bf59564b415f95f0ae41de9d35f42197509f99309e2deed"

RPROVIDES:${PN} += "qtractor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjack.so.0 \
liblilv-0.so.0 \
liblo.so.7 \
libm.so.6 \
libmad.so.0 \
libmvec.so.1 \
libogg.so.0 \
librubberband.so.3 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3 \
libxcb.so.1 \
libz.so.1"

inherit rpm
