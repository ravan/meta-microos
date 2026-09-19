SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "PackageKit-1.3.6-2.1.aarch64.rpm"
RPM_HASH = "ddd7ce6fbf9d151cc16602bbf49fcb109c6b6f29edf01d613fd14479eade72acebc94483661a6822c53a23f5f1c8ba180c53198dc9c7fb7900cd3178b55d7d62"

RPROVIDES:${PN} += "PackageKit \
libpk-backend-dummy.so"

RDEPENDS:${PN} += "/usr/bin/sh \
PackageKit-backend \
PackageKit-branding \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libpackagekit-glib2.so.18 \
libpolkit-gobject-1.so.0 \
libsqlite3.so.0 \
libsystemd.so.0"

inherit rpm
