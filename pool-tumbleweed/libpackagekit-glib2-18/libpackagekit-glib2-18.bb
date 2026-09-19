SUMMARY = "GLib integration of PackageKit"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.6"

RPM_NAME = "libpackagekit-glib2-18-1.3.6-2.1.aarch64.rpm"
RPM_HASH = "3d9265a533840785d2e59b5018bb7ca3a4c3cb2c9a18be79fe0f964e732017090b3cae9b6707171cd43fa4f13d717b68f35398fc1a7ad067dc8c8ce8074e80fa"

RPROVIDES:${PN} += "libpackagekit-glib12 \
libpackagekit-glib2-18 \
libpackagekit-glib2.so.18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
