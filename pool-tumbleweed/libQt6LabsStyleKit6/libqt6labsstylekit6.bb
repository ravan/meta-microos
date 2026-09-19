SUMMARY = "Qt 6 LabsStyleKit library"
DESCRIPTION = "The Qt 6 LabsStyleKit library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6LabsStyleKit6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "a2939113f1cc0227a9f3edf49cc9b128de89fc9a4685be3b3d78f5e2493236892468b388c579023ac7365357c1971eb6d0334dbea856d0e9a36f8efba07e2fb0"

RPROVIDES:${PN} += "libQt6LabsStyleKit.so.6 \
libQt6LabsStyleKit6 \
libQt6LabsStyleKitImpl.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
