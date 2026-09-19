SUMMARY = "RSS/Atom feed reader"
DESCRIPTION = "Alligator is a RSS/Atom feed reader."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "alligator-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "92e920e40ee1e87fe90e9431f7d5b75a60326dff72b00f36cb2063c1107ef055f4b6f37a0ce4a062957b091788108b04de5884c304eb2fc0a2324ccbb87785df"

RPROVIDES:${PN} += "alligator"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6Syndication.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
