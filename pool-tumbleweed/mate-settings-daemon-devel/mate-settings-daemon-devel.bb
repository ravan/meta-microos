SUMMARY = "MATE session settings daemon development files"
DESCRIPTION = "This package contains the daemon which is responsible for setting \
the various parameters of a MATE session and the applications that \
run under it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "mate-settings-daemon-devel-1.28.0-1.9.aarch64.rpm"
RPM_HASH = "df3d9dbcdeae90fccd93318e5cea8dba2b9940367b253898878c9ff0fe0aef420d6bf1ac2d5badac0978a8135181194dc70d3dcb18584bccd1424d1a525566ae"

RPROVIDES:${PN} += "mate-settings-daemon-devel \
pkgconfig-mate-settings-daemon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mate-settings-daemon \
pkgconfig-dbus-1 \
pkgconfig-dbus-glib-1 \
pkgconfig-glib-2.0"

inherit rpm
