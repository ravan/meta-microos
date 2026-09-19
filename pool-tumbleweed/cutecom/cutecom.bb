SUMMARY = "A graphical serial terminal"
DESCRIPTION = "CuteCom is a graphical serial terminal, similar to minicom. It is \
written using the Qt library. \
 \
It is aimed mainly at hardware developers or other people who need a \
terminal to talk to their devices."
LICENSE = "GPL-3.0-or-later"

PV = "0.60.0"

RPM_NAME = "cutecom-0.60.0-1.9.aarch64.rpm"
RPM_HASH = "06522a4cd3c247c1f576c19bbbf2add4fe54dd0d90b2e8c2c04097ceff8a3c07b21218a13065875453ec1a217404fb4f3b1204c36d27b8861b2085cad70f013f"

RPROVIDES:${PN} += "cutecom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6SerialPort.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
