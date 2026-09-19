SUMMARY = "Screen Magnifier"
DESCRIPTION = "Magnifies a part of the screen."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kmag-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "92951654db10814d98832713c92e1a2c9395b7919c59920ac1d2ec61153cd12d11034bd9de92a0b43995e530b408be15fdb6d6b796ed99354e66ed474adfb764"

RPROVIDES:${PN} += "kmag \
kmag5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqaccessibilityclient-qt6.so.0 \
libstdc++.so.6"

inherit rpm
