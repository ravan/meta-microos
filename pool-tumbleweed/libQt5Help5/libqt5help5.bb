SUMMARY = "Qt 5 Help Library"
DESCRIPTION = "The Qt 5 Help library."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde3"

RPM_NAME = "libQt5Help5-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "f0e7468140dc49b5f79b29364fe667061c6fd20ce7a18e2cd820732138068f586c68aff9dc05b5c19bdcf8b2ace15acd8c99252b3f8dfa236ff1a410cf56d744"

RPROVIDES:${PN} += "libQt5Help.so.5 \
libQt5Help5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network5 \
libQt5Sql.so.5 \
libQt5Sql5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
