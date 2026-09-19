SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6I18n6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f1bec3507098aa4f8a96520823fda17928e03b480e38ff6407aa61ddaebf881771632af70bdb10acf8ca6528ed54878a79ce1962bc6bfe9fd597570f2930ce6f"

RPROVIDES:${PN} += "libKF6I18n.so.6 \
libKF6I18n6 \
libKF6I18nLocaleData.so.6 \
libKF6I18nQml.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
iso-codes \
kf6-ki18n \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
