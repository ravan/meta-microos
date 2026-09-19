SUMMARY = "Utilities for graphical user interfaces: Build Environment"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kguiaddons-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "516d56be45b5195cd50417685cd98d9ab3f227208d46c3a37c5bd86a661bbe340268dc8564a55fd38e5830371bbb26ca69da60c35026d9f498e1e876187d7339"

RPROVIDES:${PN} += "cmake-KF6GuiAddons \
kf6-kguiaddons-devel \
pkgconfig-KF6GuiAddons"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libKF6GuiAddons6 \
pkgconfig-Qt6Gui"

inherit rpm
