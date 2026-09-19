SUMMARY = "Library for accessing the Notes Storage Facility format"
DESCRIPTION = "libnsfdb is a library to access the Notes Storage Facility (NSF) \
database file format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libnsfdb1-20260526-1.12.aarch64.rpm"
RPM_HASH = "ed15bd5c7394e90d5e3a4febb8d2c9a50f90b30f4c92888b7e620f2ebed2a8bc807ddde8e55d624c7f70b9e11e1d47f2ea8beca333f1789e951cb399cd168d21"

RPROVIDES:${PN} += "libnsfdb.so.1 \
libnsfdb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1"

inherit rpm
