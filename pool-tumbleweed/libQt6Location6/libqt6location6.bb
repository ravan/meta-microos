SUMMARY = "Qt 6 Location library"
DESCRIPTION = "The Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6Location6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7eac7df9db325f08825faac7be32c99b65301fe15fc26faa6e9e978eb48821fe5ea66e1796be4ec7e5fe33250c65ff860c4bfbd02526a28cb2238a4e06028597"

RPROVIDES:${PN} += "libQt6Location.so.6 \
libQt6Location6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Positioning.so.6 \
libQt6PositioningQuick.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libQt6QuickShapes.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
