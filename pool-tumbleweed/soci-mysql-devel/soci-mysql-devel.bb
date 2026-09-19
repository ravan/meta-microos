SUMMARY = "Development files for the soci MariaDB back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with MariaDB."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-mysql-devel-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "fe5198830de1860b53358271296323e96c43604373544bbe8f1c80eae0334a993e2d5cc2630d1d2233c3656d30bc951ae1b120ac12b2e7c4b34ced0d158a3d4d"

RPROVIDES:${PN} += "soci-mysql-devel"

RDEPENDS:${PN} += "libsoci-mysql4-0 \
pkgconfig-libmariadb \
soci-devel"

inherit rpm
