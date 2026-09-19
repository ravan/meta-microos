SUMMARY = "Lightweight image viewer"
DESCRIPTION = "nomacs is a free image viewer, which is small, fast and able to handle the \
most common image formats. Additionally it is possible to synchronise \
multiple viewers. A synchronisation of viewers running on the same \
computer or via LAN is possible. It allows to compare images and spot the \
differences (e.g. schemes of architects to show the progress)."
LICENSE = "GPL-3.0-or-later"

PV = "3.23.3"

RPM_NAME = "nomacs-3.23.3-1.1.aarch64.rpm"
RPM_HASH = "bd02be8306bd93a8774aab0f0d64023c16d8f776b06661d7a2dc7a1b4cbfff93a76cb4787ed1a50d9364147fbfb7344d4680eca3f54af4694ab0bee7ad53c68c"

RPROVIDES:${PN} += "libnomacsCore.so.3 \
nomacs"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kimageformats \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libquazip1-qt6.so.1.7 \
libraw.so.25 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
