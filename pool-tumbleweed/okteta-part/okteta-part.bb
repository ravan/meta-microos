SUMMARY = "Hex Editor KParts plugin"
DESCRIPTION = "Hex editing component for KParts"
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.28"

RPM_NAME = "okteta-part-0.26.28-1.1.aarch64.rpm"
RPM_HASH = "567e43a62b3ba45eeb25da75234fe2010dddd8cdd34641e9ed8eef5609afd3e19461250473d1a2699c64d2f00e0b768da475e205553a1ca160c81cfee93fa9e6"

RPROVIDES:${PN} += "okteta-part"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Parts.so.5 \
libKF5XmlGui.so.5 \
libKasten4Controllers.so.0 \
libKasten4Core.so.0 \
libKasten4Gui.so.0 \
libKasten4Okteta2Controllers.so.0 \
libKasten4Okteta2Core.so.0 \
libKasten4Okteta2Gui.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
