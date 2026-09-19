SUMMARY = "MySQL DBI module for Qore"
DESCRIPTION = "MySQL module for the Qore Programming Language. \
 \
This RPM provides API documentation, test and example programs"
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "2.1"

RPM_NAME = "qore-mysql-module-doc-2.1-2.5.noarch.rpm"
RPM_HASH = "45866b74214719ca731834cf8a38de17d299698f6831c1d04d551101f9fbadbaec3ba2453d33d2cfb6d2d2c121f61c7817d5928d7ca9a0d87979fec7b7279fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-mysql-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
