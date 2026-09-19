SUMMARY = "Miscellaneous user tools writen in Qore Programming Language"
DESCRIPTION = "This package contains tool for working with: \
 - REST APIs \
 - SQL Databases"
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "2.2.1"

RPM_NAME = "qore-misc-tools-2.2.1-1.1.noarch.rpm"
RPM_HASH = "63da19ac5cdbad97a87e4b781b2d507e5fbaf2d8b09b07fa360ae2e1f19d34dc75d96d87302fcddce788b5aa195b19a8e05eebaa01b3762b7ca675d3bc350799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-misc-tools"

RDEPENDS:${PN} += "qore"

inherit rpm
