SUMMARY = "Development files for libgnomesu"
DESCRIPTION = "This package contains all files needed to develop with libgnomesu."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.10"

RPM_NAME = "libgnomesu-devel-2.0.10-1.5.aarch64.rpm"
RPM_HASH = "45ef1a5a8ab049fb138dda257acb6bc52cde53798216dc868a82279dcee098ad927d5cc236dc650fbb85221e043c723b51ce6c5231f5ba266e5ee7dd0b2fee9a"

RPROVIDES:${PN} += "libgnomesu-devel \
pkgconfig-libgnomesu-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnomesu \
libgnomesu0 \
pkgconfig-glib-2.0"

inherit rpm
