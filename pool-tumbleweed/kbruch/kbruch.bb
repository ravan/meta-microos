SUMMARY = "Application to excercise fractions"
DESCRIPTION = "KBruch is an application to learn calculating with fractions."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kbruch-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "cf7588ee1e1118087f5f15bae5666f56ef56cfb5dc26046d5c9d239ada75da27bbca33cda68f07001a25e37e4a0b0337bc94eda7ab70eb723646e53ddd9fd556"

RPROVIDES:${PN} += "kbruch \
kbruch5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
