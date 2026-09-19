SUMMARY = "Qt 6 QuickTimeline library"
DESCRIPTION = "The Qt 6 QuickTimeline library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickTimeline6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2fc6812e6fd5aea626420169f93c17bedb644706872a2829840d6b3d45fcc2814e05de8477d30277553d398355ab3f8d056c42c626e9a6581c1604705b2a1850"

RPROVIDES:${PN} += "libQt6QuickTimeline.so.6 \
libQt6QuickTimeline6 \
libQt6QuickTimelineBlendTrees.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
