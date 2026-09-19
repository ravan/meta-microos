SUMMARY = "Qt5 QuickTemplates2 Library"
DESCRIPTION = "You need this package if you want to compile programs with qtquickcontrols2."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde5"

RPM_NAME = "libQt5QuickTemplates2-5-5.15.19+kde5-1.2.aarch64.rpm"
RPM_HASH = "80b88a3135a069ea589039e6d911bbb1ab32b59f84dc67db1acd8d0c6a617585cfd80624c28419338c3054e0f7294e437e7ac96c94f947fa23101c56a5610323"

RPROVIDES:${PN} += "libQt5QuickTemplates2-5 \
libQt5QuickTemplates2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QmlModels.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
