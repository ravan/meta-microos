SUMMARY = "Framework for managing menu and toolbar actions"
DESCRIPTION = "libkxmlgui provides a framework for managing menu and toolbar actions in an \
abstract way. The actions are configured through a XML description and hooks \
in the application code. The framework supports merging of multiple \
description for example for integrating actions from plugins."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5XmlGui5-5.116.0-1.13.aarch64.rpm"
RPM_HASH = "42e0649dd789f0c61aad460beeb020cac188a292b1abb989b39e0446782fc78e0585ca4cb2c73223ee510f1aaeb5dbd26c7a126a2c3dcb090d9e84c95c4557ba"

RPROVIDES:${PN} += "libKF5XmlGui.so.5 \
libKF5XmlGui5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
