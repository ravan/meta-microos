SUMMARY = "Framework for searching and managing PIM metadata"
DESCRIPTION = "AkonadiSearch is a framework for searching and managing PIM metadata"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "akonadi-search-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "47e456e271cb52d040c17428dc3df80403ec4ab151639aeff84e011c5dc3b33d40c3d57b51b0dfe62865f010fe5b530d450552e49ddaec38c01be18d0aaa8a38"

RPROVIDES:${PN} += "akonadi-search"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6Mime.so.6 \
libKF6Runner.so.6 \
libKF6TextUtils.so.1 \
libKPim6AkonadiAgentBase.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiSearchCore.so.6 \
libKPim6AkonadiSearchPIM.so.6 \
libKPim6AkonadiSearchXapian.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30"

inherit rpm
