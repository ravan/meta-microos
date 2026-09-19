SUMMARY = "Development package for pimcommon"
DESCRIPTION = "The development package for the pimcommon libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "pimcommon-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "37d59ed0ebbe348ad0782c6e048fc55e7459c9e9081c7a894c0a25a3151b48647e00ee6fe0e02d5ad005af7ee658e7701dd124825f6bf9629d0353eb4a4f8a8a"

RPROVIDES:${PN} += "cmake-KPim6PimCommon \
cmake-KPim6PimCommonActivities \
cmake-KPim6PimCommonAkonadi \
pimcommon-devel"

RDEPENDS:${PN} += "cmake-KF6Config \
cmake-KF6Contacts \
cmake-KF6KIO \
cmake-KF6TextAutoCorrectionWidgets \
cmake-KF6TextCustomEditor \
cmake-KPim6Akonadi \
cmake-KPim6AkonadiContactWidgets \
cmake-KPim6IMAP \
cmake-KPim6Libkdepim \
cmake-PlasmaActivities \
cmake-Qt6DBus \
cmake-Qt6Gui \
cmake-Qt6Widgets \
ld-linux-aarch64.so.1 \
libKPim6PimCommon.so.6 \
libKPim6PimCommon6 \
libKPim6PimCommonAkonadi.so.6 \
libKPim6PimCommonAkonadi6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
