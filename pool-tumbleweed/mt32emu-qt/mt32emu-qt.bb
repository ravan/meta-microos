SUMMARY = "The main Qt-frontend synthesiser application"
DESCRIPTION = "It facilitates both realtime synthesis and conversion of pre-recorded SMF files to WAVE making use of the mt32emu library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.8.3"

RPM_NAME = "mt32emu-qt-2.8.3-1.3.aarch64.rpm"
RPM_HASH = "0924450d238ca6e27c786b0acc9f4660d7b5167a2b2a4780c3ef464de683e5fe51301b372f123d8bc8cbf081c1a2ebad921be2f47325aa3638c88bb2407187f2"

RPROVIDES:${PN} += "mt32emu \
mt32emu-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libjack.so.0 \
libm.so.6 \
libmt32emu.so.2 \
libmt32emu2 \
libportaudio.so.2 \
libstdc++.so.6"

inherit rpm
