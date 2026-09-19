SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ki18n-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "a1e011c6d47f9aeb625380a7b0e7d83424b4334427abf6cdb138a88badd207b5c79c9a9c68b18f51fa0f8b31654f8fb52490d5f4c8279aed3acff6592ddb0d11"

RPROVIDES:${PN} += "kf6-ki18n"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
