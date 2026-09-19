SUMMARY = "Large set of desktop widgets: Build Environment"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kwidgetsaddons-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "2a018966b530a849191dffa4bd79569c647e1534300e195549faa95c46a24e31a05e5142564eb8de49f7a534fd2a688282de5f816078ca9f0ab4254128fda228"

RPROVIDES:${PN} += "cmake-KF6WidgetsAddons \
kf6-kwidgetsaddons-devel"

RDEPENDS:${PN} += "cmake-Qt6Widgets \
ld-linux-aarch64.so.1 \
libKF6WidgetsAddons.so.6 \
libKF6WidgetsAddons6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
