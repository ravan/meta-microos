SUMMARY = "Qt browser for journald database"
DESCRIPTION = "This project aims to provide an abstraction of the systemd’s journald API in \
terms of QAbstractItemModel classes. The main purpose is to ease the \
integration of journald into Qt based applications (both QML and QtWidget). \
Additional to the library, the project provides a reference implementation of \
the API, called kjournaldbrowser. Even though that application provides a \
powerful journal database reader, we aim to do a clear split between \
reuseable library and application logic."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kjournald-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2b79f1cfe8ca6e5df658bf4722d97a817591aeca455908e636bfd28d1eee774207fd000d360bafee060d14a99fb323b2fe68cea620ac668530e82eedbfcb0858"

RPROVIDES:${PN} += "kjournald \
libkjournald.so.0 \
qt6qmlimport-org.kde.kjournald"

RDEPENDS:${PN} += "/sbin/ldconfig \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKirigamiAddonsStatefulApp.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
qt6-declarative-imports"

inherit rpm
