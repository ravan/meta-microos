SUMMARY = "Libyui - Qt package selector"
DESCRIPTION = "This package contains the Qt package selector component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-qt-pkg16-4.7.7-1.1.aarch64.rpm"
RPM_HASH = "009507868fbb5434799a790f74dadb32c22db2f9c98475ef225352647f898d12eddf6487be203e3f8c414b75a1ee237d9bcb5a351162877cae3095acdf521001"

RPROVIDES:${PN} += "libyui-pkg \
libyui-qt-pkg \
libyui-qt-pkg.so.16 \
libyui-qt-pkg16 \
yast2-qt-pkg"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libyui-qt16 \
libyui.so.16 \
libyui16 \
libzypp \
libzypp.so.1735"

inherit rpm
