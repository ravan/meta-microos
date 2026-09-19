SUMMARY = "Development files for the Qt5 Tools library"
DESCRIPTION = "You need this package if you want to compile programs with qttools."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qttools-devel-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "a823ba4648fefefa4a96dc10cf9f94351a661145b69e8e1cbd2fc9d67255d7cd51be26ed775fc24163b8902a681a6c489f44b3b4b04265d9688dd7cc09b68b80"

RPROVIDES:${PN} += "cmake-Qt5Designer \
cmake-Qt5DesignerComponents \
cmake-Qt5Help \
cmake-Qt5UiPlugin \
cmake-Qt5UiTools \
libqt5-qttools-devel \
pkgconfig-Qt5Designer \
pkgconfig-Qt5Help \
pkgconfig-Qt5UiPlugin \
pkgconfig-Qt5UiTools"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Designer5 \
libQt5DesignerComponents5 \
libQt5Help5 \
libqt5-linguist-devel \
libqt5-qttools-qhelpgenerator \
libxslt-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Sql \
pkgconfig-Qt5UiPlugin \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5Xml"

inherit rpm
