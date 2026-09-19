SUMMARY = "Glib integration for DBus - development files"
DESCRIPTION = "This package provides glib integration for Mono.DBus - Development \
files."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "dbus-sharp-glib2-devel-0.6.0-2.16.noarch.rpm"
RPM_HASH = "ef3ec54442a0c475944bf3bbb95edf260a04e7b508a15179f03b750ec2a9bf242d5c05bd84c2ac08b776f1730c5db47ce2d1c61d60981671856cbe8bcc445761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp-glib2-devel \
pkgconfig-dbus-sharp-glib-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-sharp-glib2 \
pkgconfig-dbus-sharp-2.0"

inherit rpm
