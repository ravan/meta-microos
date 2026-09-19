SUMMARY = "Framework for managing menu and toolbar actions"
DESCRIPTION = "libkxmlgui provides a framework for managing menu and toolbar actions in an \
abstract way. The actions are configured through a XML description and hooks \
in the application code. The framework supports merging of multiple \
description for example for integrating actions from plugins. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kxmlgui-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4746a30a730182bcc52ea89933177d444adac2dd125bbabe03ebb4bfa2750e8fc1efa561748e2ad4aa219116ac58ce2c7db741f8ad6f15edee93ab75db73385f"

RPROVIDES:${PN} += "cmake-KF6XmlGui \
kf6-kxmlgui-devel"

RDEPENDS:${PN} += "cmake-KF6Config \
cmake-KF6ConfigWidgets \
cmake-Qt6DBus \
cmake-Qt6Widgets \
cmake-Qt6Xml \
ld-linux-aarch64.so.1 \
libKF6XmlGui.so.6 \
libKF6XmlGui6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
