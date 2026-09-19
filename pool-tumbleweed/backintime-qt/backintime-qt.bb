SUMMARY = "Back In Time Qt6 GUI"
DESCRIPTION = "This package has a Qt6 GUI for backintime."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.1"

RPM_NAME = "backintime-qt-1.6.1-1.2.noarch.rpm"
RPM_HASH = "fdf7ab4ef85cbeb1e3872221a3e27d703a2de921071b88504bb47c62171c7b122d68a26b3d118150bf71426de054860a1aa8a449652695dced656170d52d9812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "backintime-qt \
backintime-qt4"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
backintime \
libqt5-qttranslations \
polkit \
python3-PyQt6 \
python3-dbus-python"

inherit rpm
