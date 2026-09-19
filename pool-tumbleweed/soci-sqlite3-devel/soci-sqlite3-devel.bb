SUMMARY = "Development files for the soci SQLite back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with SQLite."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-sqlite3-devel-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "9b142b8b86233dbc2a8bc4474df29fb5295ec8679fb847f944677435e7867fbde875dfdd4c4ed57ead8b81a07c0b0e4a7d848a0b3280c71d99f4ef226b376399"

RPROVIDES:${PN} += "soci-sqlite3-devel"

RDEPENDS:${PN} += "libsoci-sqlite3-4-0 \
pkgconfig-sqlite3 \
soci-devel"

inherit rpm
