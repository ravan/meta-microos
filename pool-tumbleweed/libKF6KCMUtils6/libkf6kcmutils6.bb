SUMMARY = "Classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6KCMUtils6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e2ccef5fb115d9117c08826481fc8747216ea1cc9af9a476ac2595d07909587f83f73d3397b3f8e7459337c4a0d8502e575bfeb239087c26ef449da3f7dd141a"

RPROVIDES:${PN} += "libKF6KCMUtils.so.6 \
libKF6KCMUtils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kcmutils \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
