SUMMARY = "Framework for managing menu and toolbar actions"
DESCRIPTION = "libkxmlgui provides a framework for managing menu and toolbar actions in an \
abstract way. The actions are configured through a XML description and hooks \
in the application code. The framework supports merging of multiple \
description for example for integrating actions from plugins. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "kxmlgui-devel-5.116.0-1.13.aarch64.rpm"
RPM_HASH = "02d19b4f13055ef15708a4f44c8c8402e6897c26cc558a53ff887fc7eb66e7ba8f64b457564d62add418fa1bf8f41fad3ce876fee01bc3a0ce07ce2820da007b"

RPROVIDES:${PN} += "cmake-KF5XmlGui \
kxmlgui-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5ConfigWidgets \
cmake-Qt5DBus \
cmake-Qt5Widgets \
cmake-Qt5Xml \
ld-linux-aarch64.so.1 \
libKF5XmlGui.so.5 \
libKF5XmlGui5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
