SUMMARY = "Glib integration for DBus - development files"
DESCRIPTION = "This package provides glib integration for Mono.DBus - Development \
files."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "dbus-sharp-glib-devel-0.5.0-15.15.noarch.rpm"
RPM_HASH = "b5e2a4f72f3387e8ed5dee3cc8ed0b05843616653e42d113f987be772d6fe653a6d1a276bc44465eb2bb91176dc62964b400b516c99edc40c883dc4a3cc03327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp-glib-devel \
pkgconfig-dbus-sharp-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-sharp-glib \
pkgconfig-dbus-sharp-1.0"

inherit rpm
