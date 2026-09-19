SUMMARY = "KDE Text editing widgets: Build Environment"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "ktextwidgets-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "e843aba687c8d0f1401dce85bcc579bac7265229872fd1dd9ccb2ba702071bfb3d1ba2074df4d86b8afba1735e746f4c9822a30346abceaffc7f1bfe92103ce2"

RPROVIDES:${PN} += "cmake-KF5TextWidgets \
ktextwidgets-devel"

RDEPENDS:${PN} += "cmake-KF5I18n \
cmake-KF5Sonnet \
cmake-Qt5Widgets \
ld-linux-aarch64.so.1 \
libKF5TextWidgets.so.5 \
libKF5TextWidgets5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
