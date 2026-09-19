SUMMARY = "Multiple Arcade Machine Emulator"
DESCRIPTION = "MAME is an emulator designed to recreate the hardware of arcade game \
systems in software on modern personal computers. The source code to \
MAME serves as this hardware documentation. The fact that the \
software is usable serves primarily to validate the accuracy of the \
documentation."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.289"

RPM_NAME = "mame-0.289-1.1.aarch64.rpm"
RPM_HASH = "4b2be1982a84c478a89c3f77b89b74ab006e438e781e59c27daa15e536730be9dc21f02c9ff2c84ec92effe36f2df953948aea5e316086a36b84ae2671edc7ad"

RPROVIDES:${PN} += "config-mame \
mame"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libGL.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libSDL2-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libasound.so.2 \
libc.so.6 \
libexpat.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libportaudio.so.2 \
libportmidi.so.2 \
libpugixml.so.1 \
libpulse.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libutf8proc.so.3 \
libz.so.1 \
mame-data"

inherit rpm
