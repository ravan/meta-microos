SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ki18n-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f2ff2cbcdc6d6eb045cee1023b73015655760d0995ff463d1f71c33fe0fa6bfbaedb31aa07ec3abed974781dadce3719119fea7f7d1a571d96d6fb9a3314ebc2"

RPROVIDES:${PN} += "cmake-KF6I18n \
kf6-ki18n-devel"

RDEPENDS:${PN} += "cmake-Qt6Widgets \
gettext-runtime \
gettext-tools \
kf6-extra-cmake-modules \
libKF6I18n6 \
python3"

inherit rpm
