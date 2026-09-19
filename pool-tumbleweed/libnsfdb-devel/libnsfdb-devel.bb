SUMMARY = "Development files for libnsfdb"
DESCRIPTION = "libnsfdb is a library to access the Notes Storage Facility (NSF) \
database file format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnsfdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libnsfdb-devel-20260526-1.12.aarch64.rpm"
RPM_HASH = "9ac7b907d8391cd348caf64a17d65c3eab80d8d548c9b78503f302e9174de4fa219d27e194fd61ce4312a5f7b1f2cec050e45eaf239da348de004f078daef21e"

RPROVIDES:${PN} += "libnsfdb-devel \
pkgconfig-libnsfdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libnsfdb1"

inherit rpm
