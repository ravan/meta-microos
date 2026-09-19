SUMMARY = "E-book plugin and library"
DESCRIPTION = "Mobipocket E-book plugin and library."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libQMobipocket6-3-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "50763e791fb178261c479b8c59052583f1342e3684a6003ff11a7fbf510860d34a78c35e896162a64998f33a3c59bef359d31045393bc4e2443d12226b3c3bde"

RPROVIDES:${PN} += "libQMobipocket6-3 \
libQMobipocket6.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
