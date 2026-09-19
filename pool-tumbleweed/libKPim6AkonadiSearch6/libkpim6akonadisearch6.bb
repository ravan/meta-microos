SUMMARY = "Core libraries for AkonadiSearch"
DESCRIPTION = "AkonadiSearch is a framework for searching and managing PIM metadata. \
This package contains the core libraries"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiSearch6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "67c123deff64c02b4b140d76136effd08f967f665f4c7fb9a40e9010778f3e21aacd75d910db906eeafd9c100f7eb4ded6388703f89636c9929c401a601f0bb1"

RPROVIDES:${PN} += "libKPim6AkonadiSearch6 \
libKPim6AkonadiSearchCore.so.6 \
libKPim6AkonadiSearchDebug.so.6 \
libKPim6AkonadiSearchPIM.so.6 \
libKPim6AkonadiSearchXapian.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libKPim6AkonadiCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30"

inherit rpm
