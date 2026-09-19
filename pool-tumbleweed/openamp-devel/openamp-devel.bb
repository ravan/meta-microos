SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "BSD-3-Clause"

PV = "2020.01"

RPM_NAME = "openamp-devel-2020.01-2.9.aarch64.rpm"
RPM_HASH = "ff9b91df9c4955a37535b3e5214ac1860ae25caf39d8ddac1ad609d9ad3dd292a273257863fe5821256e0daaf163c7b7898d765a33234952296c8b5895957eae"

RPROVIDES:${PN} += "openamp-devel"

RDEPENDS:${PN} += "libopen-amp0"

inherit rpm
