SUMMARY = "Zypp backend for the PackageKit installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "PackageKit-backend-zypp-1.3.6-2.1.aarch64.rpm"
RPM_HASH = "e65d2183092f88263540488bd683861ea74a54cb41e173e9daf41550d536030b9480d6ebfaef7713a995ac6979ff25e82707014f22895c26a288d97e779447eb"

RPROVIDES:${PN} += "PackageKit-backend \
PackageKit-backend-zypp \
libpk-backend-zypp.so"

RDEPENDS:${PN} += "PackageKit \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libpackagekit-glib2.so.18 \
libstdc++.so.6 \
libzypp \
libzypp.so.1735"

inherit rpm
