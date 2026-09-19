SUMMARY = "C++ Interface for XML Files -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.0"

RPM_NAME = "libxml++40-devel-4.2.0-1.9.aarch64.rpm"
RPM_HASH = "624f6a86ef37e5a16e2916b39899d05326d4d98c000733941c610d7d4606bb53dbf28ca2b930cc7f9ec67f79ae6a601de874daaf67bbba087315eab68ba842d6"

RPROVIDES:${PN} += "libxml++40-devel \
pkgconfig-libxml++-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxml++-4-0-1 \
pkgconfig-glibmm-2.68 \
pkgconfig-libxml-2.0"

inherit rpm
