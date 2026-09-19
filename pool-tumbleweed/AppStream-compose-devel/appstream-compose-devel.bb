SUMMARY = "Header files for AppStream Compose support"
DESCRIPTION = "This package contains all necessary files, libraries, \
configuration files to add compose support using compose."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "AppStream-compose-devel-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "dd91de5a729a4e4c99f1a10bdfae3f9bb7329c961f83cc98fd588a73a9a7f2846451ca31380edde262213d4a5fd2e25209eab88b280e1c709db5d7dfd00a0ee5"

RPROVIDES:${PN} += "AppStream-compose-devel \
pkgconfig-appstream-compose"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
AppStream \
AppStream-compose \
libappstream-compose0 \
pkgconfig-appstream \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
