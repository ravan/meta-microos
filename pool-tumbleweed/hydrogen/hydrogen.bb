SUMMARY = "A Real-Time Drum Machine and Sequencer"
DESCRIPTION = "Hydrogen is a software synthesizer which can be used alone, emulating \
a drum machine based on patterns, or via an external MIDI \
keyboard/sequencer software. \
 \
It features a modular and graphical interface based on QT5, has a \
sample-based stereo audio engine, with import of sound samples in PCM \
formats. Furthermore, a pattern-based sequencer with the ability to \
chain patterns into a song. Up to 64 ticks per pattern with \
individual level per event and variable pattern length are possible. \
32 instrument tracks with volume, mute, solo, pan capabilities are \
provided, and there is multi-layer support for instruments (up to 16 \
samples for each instrument). Human velocity, human time, pitch and \
swing functions are implemented as well."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "hydrogen-1.2.6-1.6.aarch64.rpm"
RPM_HASH = "63ffde72d47832bdc10b07b4211c2f8a63e439417b670c098559fdeeedcebcc23b30cd7d7c9e20a5377afae040d3a34ce443122305cb92bd1f975974c6c571cc"

RPROVIDES:${PN} += "hydrogen"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhydrogen-core-1.2.6.so \
libm.so.6 \
libstdc++.so.6 \
rubberband-cli"

inherit rpm
