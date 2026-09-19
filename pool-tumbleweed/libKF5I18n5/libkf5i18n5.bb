SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5I18n5-5.116.0-1.13.aarch64.rpm"
RPM_HASH = "33a7d394b14227cd2318d549240321f7920aa267fada9320d16e4f225d77251195cb6e7f4e243db51e0cdac5c0c47e45860ebf222d563c4f95e8d6589455348b"

RPROVIDES:${PN} += "libKF5I18n.so.5 \
libKF5I18n5 \
libKF5I18nLocaleData.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
iso-codes \
iso-codes-lang \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
