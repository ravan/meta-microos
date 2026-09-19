SUMMARY = "Development files for the MaxMind DB file format library"
DESCRIPTION = "The libmaxminddb library provides a C library for reading MaxMind DB \
files, including the GeoIP2 databases from MaxMind. This is a \
custom binary format designed to facilitate fast lookups of IP \
addresses while allowing for great flexibility in the type of \
data associated with an address. \
 \
This package contains the development files for libmaxminddb."
LICENSE = "Apache-2.0"

PV = "1.13.3"

RPM_NAME = "libmaxminddb-devel-1.13.3-1.4.aarch64.rpm"
RPM_HASH = "aca8265e744af1866069f7637c82aa2aabc18707f164bf3acf19957a2b8e1180619ecf9828283252a48187cb3b295d7ae582a64c1b5ea7d2b700c613b893d09d"

RPROVIDES:${PN} += "libmaxminddb-devel \
pkgconfig-libmaxminddb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmaxminddb0"

inherit rpm
