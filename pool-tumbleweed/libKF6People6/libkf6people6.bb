SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6People6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "9c5b5484df6ce4cb677e52752e90956efb5469c39373f4dbaf123f12c1cecf9fa1bfa88ee2ce6974fb3b65e257cc386e57ec317339c66f502f29a156065cb337"

RPROVIDES:${PN} += "libKF6People.so.6 \
libKF6People6 \
libKF6PeopleBackend.so.6 \
libKF6PeopleWidgets.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kpeople \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
