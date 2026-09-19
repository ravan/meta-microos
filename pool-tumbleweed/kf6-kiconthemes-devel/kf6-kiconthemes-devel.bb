SUMMARY = "Icon GUI utilities: Build Environment"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kiconthemes-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "2b555d5405d8c02359e0bec5febd7794ec1057999062bf272fa35bae8d03abd7069c70d69ea53e5237db294b2db38d0028cc06dfca62cc9827fe919100c86062"

RPROVIDES:${PN} += "cmake-KF6IconThemes \
kf6-kiconthemes-devel"

RDEPENDS:${PN} += "cmake-Qt6Widgets \
ld-linux-aarch64.so.1 \
libKF6IconThemes.so.6 \
libKF6IconThemes6 \
libKF6IconWidgets.so.6 \
libKF6IconWidgets6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
