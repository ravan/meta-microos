SUMMARY = "Ndesk-dbus-glib provides glib integration for NDesk.DBus"
DESCRIPTION = "Ndesk-dbus-glibl provides glib integration for NDesk.DBus"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "ndesk-dbus-glib-devel-0.4.1-59.25.noarch.rpm"
RPM_HASH = "c00857a6e4a3871d2a6ee576ba8ca282c1ebc541c9132b748d14122d36e985bb9cefaa8d39117a6ff691cc323b5d0c4517c3792d05eb012dae40eb8c11021692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ndesk-dbus-glib-devel \
pkgconfig-ndesk-dbus-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ndesk-dbus-glib \
pkgconfig-ndesk-dbus-1.0"

inherit rpm
