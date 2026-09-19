SUMMARY = "DNF5 backend for the PackageKit installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "PackageKit-backend-dnf5-1.3.6-2.1.aarch64.rpm"
RPM_HASH = "2be2aef361909ae950d32a813d4f773a69beaaae65af8cf848aa799492bae077107f4def14e8b58efe60b4dc4ca4b5344ce83724e1e0101e20a7601030d8a1e3"

RPROVIDES:${PN} += "PackageKit-backend \
PackageKit-backend-dnf \
PackageKit-backend-dnf5 \
libpk-backend-dnf5.so"

RDEPENDS:${PN} += "PackageKit \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5-plugin-appstream \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpackagekit-glib2.so.18 \
librpm.so.10 \
librpmio.so.10 \
libsdbus-c++.so.2 \
libstdc++.so.6"

inherit rpm
