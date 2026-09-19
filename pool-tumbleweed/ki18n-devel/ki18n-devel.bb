SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "ki18n-devel-5.116.0-1.13.aarch64.rpm"
RPM_HASH = "843dd703be3515a101065d47f9c5a4e4d34b12e3f0abcd406a9044003e393154562c88856f1c1c41c0bbc89ceb8b054e40a8f477107d4e438d8dbaa77c11e36b"

RPROVIDES:${PN} += "cmake-KF5I18n \
ki18n-devel"

RDEPENDS:${PN} += "gettext-runtime \
gettext-tools \
libKF5I18n5 \
python3"

inherit rpm
