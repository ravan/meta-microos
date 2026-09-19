SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "libpackagekitqt6-2-1.1.4-1.5.aarch64.rpm"
RPM_HASH = "725519662b0d0d0eb0aeaf21086026a9fa83c4057f52ef8258d3514578384dd3b5c9933098b5aae65c1f5a6895ae53d878b92636f1e2824ef38be9ab95d49af6"

RPROVIDES:${PN} += "libpackagekitqt6-2 \
libpackagekitqt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
