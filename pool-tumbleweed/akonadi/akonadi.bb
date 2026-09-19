SUMMARY = "PIM Storage Service"
DESCRIPTION = "This package contains the data files of Akonadi, the KDE PIM storage \
service."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4bc7c55abb4442aee76e4a2aff5c31d50b5acf0980468872e5b3c530e25ea462ec60d53fc9d71e6d4dc5393fd3c0bc3205138e86f106d4a6e84142f66cd35105"

RPROVIDES:${PN} += "akonadi \
akonadi-server \
config-akonadi"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libKPim6AkonadiAgentBase.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiPrivate.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6AkonadiXml.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
mariadb \
qt6-sql-mysql \
qt6-sql-sqlite \
sqlite3"

inherit rpm
