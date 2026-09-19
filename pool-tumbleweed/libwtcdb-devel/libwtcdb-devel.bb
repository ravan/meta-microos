SUMMARY = "Development files for libwtcdb"
DESCRIPTION = "libwtcdb is a library to access the Windows (Vista/7) Explorer \
thumbnail cache database (WTCDB) format (thumbcache.db). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libwtcdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20260527"

RPM_NAME = "libwtcdb-devel-20260527-1.10.aarch64.rpm"
RPM_HASH = "0379b42e280493150c57a59673df20e74b0b6c49babda7a21522cbd439a6e9a458b984c836b649870c1b6af173700f391751cbb750ddba5187caf4628ec2762d"

RPROVIDES:${PN} += "libwtcdb-devel \
pkgconfig-libwtcdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libwtcdb1"

inherit rpm
