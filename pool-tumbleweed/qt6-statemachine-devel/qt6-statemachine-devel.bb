SUMMARY = "Qt 6 StateMachine library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachine library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-statemachine-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "22e75ec802b03bbc32333ee262ac8f159d8bcb1bab28f34e00a955c00212788b3ba6a8eec4c67c4dc833169584430f78074256169ab9da86cfb7502ef43a639f"

RPROVIDES:${PN} += "cmake-Qt6StateMachine \
pkgconfig-Qt6StateMachine \
qt6-statemachine-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6ScxmlGlobalPrivate \
libQt6StateMachine6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
