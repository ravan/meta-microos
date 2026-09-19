SUMMARY = "Development files for fcitx5"
DESCRIPTION = "This package provides development files for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.17"

RPM_NAME = "fcitx5-devel-5.1.17-1.7.aarch64.rpm"
RPM_HASH = "cd7803eb01a7ee1a1b9c5d0fbdfb52aa3a048ebaab8bc714459b8a6ee2eedd9f8857a553339f9435ececdb3662f04ac2a977453aeb32389ef8276a6c5fe9c700"

RPROVIDES:${PN} += "cmake-Fcitx5Config \
cmake-Fcitx5Core \
cmake-Fcitx5Module \
cmake-Fcitx5ModuleClipboard \
cmake-Fcitx5ModuleDBus \
cmake-Fcitx5ModuleEmoji \
cmake-Fcitx5ModuleNotificationItem \
cmake-Fcitx5ModuleNotifications \
cmake-Fcitx5ModuleQuickPhrase \
cmake-Fcitx5ModuleSpell \
cmake-Fcitx5ModuleTestFrontend \
cmake-Fcitx5ModuleTestIM \
cmake-Fcitx5ModuleUnicode \
cmake-Fcitx5ModuleWayland \
cmake-Fcitx5ModuleXCB \
cmake-Fcitx5Utils \
fcitx-devel \
fcitx5-devel \
pkgconfig-Fcitx5Config \
pkgconfig-Fcitx5Core \
pkgconfig-Fcitx5Module \
pkgconfig-Fcitx5Utils \
rpm-macro--fcitx5-addondir \
rpm-macro--fcitx5-datadir \
rpm-macro--fcitx5-imconfdir \
rpm-macro--fcitx5-libdir \
rpm-macro--fcitx5-libexecdir \
rpm-macro--fcitx5-qt5dir \
rpm-macro--fcitx5-qt6dir"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fcitx5 \
libFcitx5Config6 \
libFcitx5Core7 \
libFcitx5Utils2 \
pkgconfig-Fcitx5Config \
pkgconfig-Fcitx5Core \
pkgconfig-Fcitx5Utils"

inherit rpm
