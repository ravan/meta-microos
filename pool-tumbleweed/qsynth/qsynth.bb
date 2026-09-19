SUMMARY = "Graphical User Interface for fluidsynth"
DESCRIPTION = "Qsynth is a fluidsynth GUI front-end application written in C++ around the Qt5 \
toolkit using Qt Designer."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.6"

RPM_NAME = "qsynth-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "77cebf82802b2bf511e04160722c5a08c7cc899ec3c0aa606e3451681abd05e3207eedd6482751efc1a39872a727ba738832a75c8e10fb026917c6612ea0c10b"

RPROVIDES:${PN} += "qsynth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpipewire-0.3.so.0 \
libstdc++.so.6"

inherit rpm
