SUMMARY = "Development files for the soci PostgreSQL back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with PostgreSQL."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-postgresql-devel-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "d77acccd327fac1642d2a6ee8a56a91000dea8ba70cbda3c04ebbc50cabd5be0aed444e71ce57ed36049ba0a01961ddf7b87d5b4b14bddbfd9ee420bcea5e5a3"

RPROVIDES:${PN} += "soci-postgresql-devel"

RDEPENDS:${PN} += "libsoci-postgresql4-0 \
pkgconfig-libpq \
soci-devel"

inherit rpm
