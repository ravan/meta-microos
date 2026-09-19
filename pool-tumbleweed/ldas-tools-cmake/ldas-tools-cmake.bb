SUMMARY = "A collection of CMake functions used by LDAS (LIGO Data Analysis System) Tools"
DESCRIPTION = "LDAS (LIGO Data Analysis System) is a collection of libraries and executables \
aid in the processing of gravitation wave data sets. ldas-tools-cmake provides the \
a collection of cmake functions used by LDAS."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "ldas-tools-cmake-1.3.0-1.6.noarch.rpm"
RPM_HASH = "b3df8040514c7fdb833e3b51e82677a146757d0c079b819b974b8322706a5730965b12dc0f3ffe600defd96ab1e83711abc50e1b647319f5cd0a5c7db2d48f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ldas-tools-cmake \
pkgconfig-ldastoolscmake"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-igwncmake"

inherit rpm
