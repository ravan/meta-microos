SUMMARY = "Development files for libdbusmenu-glib"
DESCRIPTION = "This package contains the development files for the dbusmenu-glib library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-glib-devel-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "7f43e2e23dcfe39e71221cf81060433e69b6831d48f4f0f2de772551019fc26457969c847a599a72578a8f5bacbad7f4662f644699bc1bb5314a3e32bfa47748"

RPROVIDES:${PN} += "libdbusmenu-glib-devel \
pkgconfig-dbusmenu-glib-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-glib4 \
pkgconfig-dbus-glib-1 \
typelib-1-0-Dbusmenu-0-4"

inherit rpm
