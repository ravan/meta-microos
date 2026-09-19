SUMMARY = "Development files for alure"
DESCRIPTION = "The alure-devel package contains libraries and header files for \
developing applications that use alure."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "alure-devel-1.2-6.4.aarch64.rpm"
RPM_HASH = "4436fdcd2131e6f50f24dcc117d5ad91142a0c8abcbd1bb2613343cfaec2c875439f62fb627dacf0ad85f804a2b746ef735d2a172d1bb22781dd63576dfd47ed"

RPROVIDES:${PN} += "alure-devel \
pkgconfig-alure"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libalure1 \
pkgconfig-openal"

inherit rpm
