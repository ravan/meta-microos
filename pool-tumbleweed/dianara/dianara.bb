SUMMARY = "Pump.io social network desktop client"
DESCRIPTION = "Dianara is a client for pump.io (and GNU MediaGoblin), a desktop \
application for GNU/Linux that allows users to manage their pump.io \
social networking accounts without the need to use a web browser. \
You can read your timelines, post messages and pictures, and manage \
your contacts."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "dianara-1.4.4-1.14.aarch64.rpm"
RPM_HASH = "680fd74955252e68a6debc15bc2ecffa46bcd11a087d897f6f11c2f960cc2a7c71621805b2a4682d3be0fd9214e8a6daa850fa66a548b3138be636faf0d3e441"

RPROVIDES:${PN} += "dianara"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqca-qt5.so.2 \
libqoauth.so.2 \
libstdc++.so.6"

inherit rpm
