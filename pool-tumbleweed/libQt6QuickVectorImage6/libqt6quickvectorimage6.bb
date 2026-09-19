SUMMARY = "Qt 6 QuickVectorImage library"
DESCRIPTION = "The Qt 6 QuickVectorImage library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickVectorImage6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "1f5e16bb24323167f3575fef36e1aff2a3cc9f06dda45fe3389f8973e8a23379a587e7a99cddb65470773f97174993d1c12c322ead77ec83d276667e2f4afaa0"

RPROVIDES:${PN} += "libQt6QuickVectorImage.so.6 \
libQt6QuickVectorImage6 \
libQt6QuickVectorImageGenerator.so.6 \
libQt6QuickVectorImageHelpers.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Svg.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
