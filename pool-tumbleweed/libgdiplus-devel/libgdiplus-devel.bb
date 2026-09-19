SUMMARY = "Development files for libgdiplus"
DESCRIPTION = "This library is part of the Mono project. It is required when \
using System.Drawing."
LICENSE = "(LGPL-2.1-or-later | MPL-1.1) & MIT"

PV = "6.2"

RPM_NAME = "libgdiplus-devel-6.2-1.7.aarch64.rpm"
RPM_HASH = "d93831a7830e8bf564ac98398f75ea40e5df95f4daed2c43952ad45529062bd88f36d74e3fcd43146e6125dc184402cbbb7640ee53a98fbc164c1b8314cfc466"

RPROVIDES:${PN} += "libgdiplus-devel \
pkgconfig-libgdiplus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdiplus0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gthread-2.0"

inherit rpm
