SUMMARY = "Graphics file thumbnail generators"
DESCRIPTION = "This package allows KDE applications to show thumbnails \
and previews of graphics files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kdegraphics-thumbnailers-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0eee7c6ee9ecfaac938564848a1354acd8d4c4bbdbf071a91e5680b5d2c1fc63f6abd198fb1bdd7ada713c6c25e1514e8acb76a2850f9c5d298aba143e318420"

RPROVIDES:${PN} += "kdegraphics-thumbnailers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDcrawQt6.so.5 \
libKExiv2Qt6.so.0 \
libKF6Archive.so.6 \
libKF6CoreAddons.so.6 \
libKF6KIOGui.so.6 \
libQMobipocket6.so.3 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
