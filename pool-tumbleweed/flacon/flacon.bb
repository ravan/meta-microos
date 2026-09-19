SUMMARY = "Audio File Encoder"
DESCRIPTION = "Flacon extracts individual tracks from one big audio file containing the entire \
album of music and saves them as separate audio files. To do this, it uses \
information from the appropriate CUE file. Besides, Flacon makes it possible \
to conveniently revise or specify tags both for all tracks at once or for each \
tag separately."
LICENSE = "LGPL-2.1-or-later"

PV = "13.0.2"

RPM_NAME = "flacon-13.0.2-1.1.aarch64.rpm"
RPM_HASH = "822cad17fdf45d05210417239a97cdb22181108cd95176c024fa04335bae0f57e5809851ea4d3b551f4639931407ffcba15de9bffadf8a5ba551c039ee3596f0"

RPROVIDES:${PN} += "flacon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtag.so.2 \
libuchardet.so.0"

inherit rpm
