SUMMARY = "Utilities for graphical user interfaces: Build Environment"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kguiaddons-devel-5.116.0-1.11.aarch64.rpm"
RPM_HASH = "2225d0e19dadf872b755ff694ae395dd0a044739e6aae9f5caf96c2444c212455a232835b5339e4ed133661d40dd1aba8524b110bb89860ac961d7ff6bdbecb0"

RPROVIDES:${PN} += "cmake-KF5GuiAddons \
kguiaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
libKF5GuiAddons5"

inherit rpm
