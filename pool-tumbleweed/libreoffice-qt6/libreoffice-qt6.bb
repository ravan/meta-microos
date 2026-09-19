SUMMARY = "Qt6/KDE Frameworks interface for LibreOffice"
DESCRIPTION = "This package contains Qt6/KDE Frameworks interface rendering options for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-qt6-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "e00d49ba07d4ab9e1900dd7df57e505d7a452fb41970e7601bd37ecfaedf81870d9f5ad6d0f56d0fe44fcf2d1432460b147ccb7bad81e617fbca5c69c9cdc073"

RPROVIDES:${PN} += "libreoffice-qt6 \
libvclplug-kf6lo.so \
libvclplug-qt6lo.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgcc-s.so.1 \
libharfbuzz.so.0 \
libi18nlangtag.so \
libjvmaccesslo.so \
libm.so.6 \
libmergedlo.so \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
libxmlreaderlo.so \
rtld-GNU-HASH"

inherit rpm
