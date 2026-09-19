SUMMARY = "Development files for libpantheon-calendar"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications"
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-calendar-devel-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "e402575b509193550f1c7253a8228e7d64d57fb7efc76858b5ee22e40486130ab5486e33a6220788416a86d7f7fc0391f44d28be536b073a78dd77769195ca18"

RPROVIDES:${PN} += "pantheon-calendar-devel \
pkgconfig-elementary-calendar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libelementary-calendar0 \
pkgconfig-gee-0.8 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-granite \
pkgconfig-gtk+-3.0 \
pkgconfig-libecal-2.0 \
pkgconfig-libedataserver-1.2 \
pkgconfig-libedataserverui-1.2 \
pkgconfig-libical-glib"

inherit rpm
