SUMMARY = "Framework for managing menu and toolbar actions"
DESCRIPTION = "libkxmlgui provides a framework for managing menu and toolbar actions in an \
abstract way. The actions are configured through a XML description and hooks \
in the application code. The framework supports merging of multiple \
description for example for integrating actions from plugins."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6XmlGui6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4d1ab13df9989f7eeac7fbd62b11ad4372ae6f9cd137cd602c8b0eeff48ae5a9cb5894b769158e62b5c5c368af104e819dd09bcdf52bcd7b358897c00fb8d603"

RPROVIDES:${PN} += "libKF6XmlGui.so.6 \
libKF6XmlGui6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kxmlgui \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemViews.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
