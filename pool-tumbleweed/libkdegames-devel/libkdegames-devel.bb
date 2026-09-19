SUMMARY = "Library for KDE Games: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop KDE games."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkdegames-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "845de6ffa2f3c706c47fc4fc0df9974e43a6522ca1afdd8e329b55e8a2f7d7f63511721fce6c01fff6a158c2523314a765649b4cc9bc690a15e30085dbf58465"

RPROVIDES:${PN} += "cmake-KDEGames6 \
libkdegames-devel"

RDEPENDS:${PN} += "cmake-KF6Completion \
cmake-KF6Config \
cmake-KF6ConfigWidgets \
cmake-KF6I18n \
cmake-KF6WidgetsAddons \
cmake-Qt6Network \
cmake-Qt6Qml \
cmake-Qt6QuickWidgets \
cmake-Qt6Widgets \
cmake-Qt6Xml \
libKDEGames6"

inherit rpm
