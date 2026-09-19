SUMMARY = "Oxygen style for Qt 5"
DESCRIPTION = "This package contains the libraries of the Oxygen style for Qt 5."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "oxygen6-style-qt5-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "c23a30b67383790c1a3f992c64b8a140b275623ea8e6bd04d3b3a626cf5ac676ce516ed74cb79c7bb5070d78b33858ea7f7fe8d083348d40ec9aa8813d7f2d1e"

RPROVIDES:${PN} += "liboxygenstyle5.so.6 \
liboxygenstyleconfig5.so.6 \
oxygen6-style-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5Style.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1 \
oxygen6-style"

inherit rpm
