SUMMARY = "KDE Text editing widgets: Build Environment"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ktextwidgets-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "3564f33c8831bedfc74db4a7c2ba116c1aca834ce66cdd0ff1c7d37e1b3b5a646c3fcfbe863e6741c5640185e976ab1c3ab8116467d35ae65130117b7d89b2df"

RPROVIDES:${PN} += "cmake-KF6TextWidgets \
kf6-ktextwidgets-devel"

RDEPENDS:${PN} += "cmake-KF6I18n \
cmake-KF6Sonnet \
cmake-Qt6Widgets \
kf6-extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF6TextWidgets.so.6 \
libKF6TextWidgets6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
