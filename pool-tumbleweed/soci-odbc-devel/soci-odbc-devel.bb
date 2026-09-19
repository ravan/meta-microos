SUMMARY = "Development files for the soci ODBC back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with unixODBC."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-odbc-devel-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "1747766b48ccf8b717e3a2dc798de369fbf1c6800624693a1cee0db927603f84a2f7e2fa9401bc4472bf4d1dbbf7955ed30c4ec835b38bb5833435e9be422c2d"

RPROVIDES:${PN} += "soci-odbc-devel"

RDEPENDS:${PN} += "libsoci-odbc4-0 \
pkgconfig-odbc \
soci-devel"

inherit rpm
