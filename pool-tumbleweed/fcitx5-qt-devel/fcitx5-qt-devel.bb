SUMMARY = "Development files for fcitx5-qt"
DESCRIPTION = "This package provides development files for fcitx5-qt."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.12"

RPM_NAME = "fcitx5-qt-devel-5.1.12-1.10.aarch64.rpm"
RPM_HASH = "78422991b352622041d58efa8f5ef1957e570d917f9ea8757d91f6bcc6a464f2017b48631a1370eaded6a1b775bf86144c0324d0d34888eb0e066a06aa6ee947"

RPROVIDES:${PN} += "cmake-Fcitx5Qt5DBusAddons \
cmake-Fcitx5Qt5WidgetsAddons \
cmake-Fcitx5Qt6DBusAddons \
cmake-Fcitx5Qt6WidgetsAddons \
fcitx5-qt-devel"

RDEPENDS:${PN} += "fcitx5-qt5 \
fcitx5-qt6 \
libFcitx5Qt5DBusAddons1 \
libFcitx5Qt5WidgetsAddons2 \
libFcitx5Qt6DBusAddons1 \
libFcitx5Qt6WidgetsAddons2"

inherit rpm
