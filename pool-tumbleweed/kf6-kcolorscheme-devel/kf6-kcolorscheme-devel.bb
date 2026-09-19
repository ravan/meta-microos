SUMMARY = "Classes to read and interact with KColorScheme: Build Environment"
DESCRIPTION = "Classes to read and interact with KColorScheme. Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcolorscheme-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "ddfd1056e94d0ae1943d5ed7492b11d798b355cca8577b004d3b8f76329afaef877a647bb6ea46311462075a00236d3a9bbaa04b88a7ed09daa1ea73e26bbff3"

RPROVIDES:${PN} += "cmake-KF6ColorScheme \
kf6-kcolorscheme-devel"

RDEPENDS:${PN} += "cmake-KF6GuiAddons \
cmake-KF6I18n \
cmake-Qt6Gui \
libKF6ColorScheme6"

inherit rpm
