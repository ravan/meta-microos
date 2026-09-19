SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "packagekitqt6-devel-1.1.4-1.5.aarch64.rpm"
RPM_HASH = "70191acda0ba2febde14a86ee321ec8d0b0a491fac2dd9d7cf70160abd1dde6307d56918ae7c84cc84f7eabfe292add86c14e3cafa40ae742a9bb470e3f6e1b5"

RPROVIDES:${PN} += "cmake-packagekitqt6 \
packagekitqt6-devel \
pkgconfig-packagekitqt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpackagekitqt6-2 \
pkgconfig-Qt6Core \
pkgconfig-Qt6DBus"

inherit rpm
