SUMMARY = "Qt 6 StateMachineQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachineQml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-statemachineqml-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "25e8f316e831d54dcca68697c7b458b45709b4fdb00a81064840bd83d9fa778046b451ab4864825cc8bc3a5da6afff4041caa61199d73869b39ff89aaa492371"

RPROVIDES:${PN} += "cmake-Qt6StateMachineQml \
pkgconfig-Qt6StateMachineQml \
qt6-statemachineqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6StateMachine \
libQt6StateMachineQml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6StateMachine"

inherit rpm
