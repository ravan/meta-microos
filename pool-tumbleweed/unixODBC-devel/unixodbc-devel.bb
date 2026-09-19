SUMMARY = "Includes for ODBC Development"
DESCRIPTION = "Includes for ODBC development (based on unixODBC)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.14"

RPM_NAME = "unixODBC-devel-2.3.14-1.7.aarch64.rpm"
RPM_HASH = "68b742737b9937d3f15aacb342d0b4e15d8ccc8157164e0de73124018ff66f51c7967fb865357f9707c8750730267129ef650b5e0e966a1ecdbedce86177bf52"

RPROVIDES:${PN} += "pkgconfig-odbc \
pkgconfig-odbccr \
pkgconfig-odbcinst \
unixODBC-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libodbc2 \
pkgconfig-odbc \
unixODBC"

inherit rpm
