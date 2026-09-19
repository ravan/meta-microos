SUMMARY = "PostgreSQL DBI module for Qore"
DESCRIPTION = "PostgreSQL module for the Qore Programming Language. \
 \
This package provides API documentation, test and example programs"
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "3.2.0"

RPM_NAME = "qore-pgsql-module-doc-3.2.0-4.5.aarch64.rpm"
RPM_HASH = "e5178893b59079aea119259ff79287e297832c45a7ef68b326f834c1dc76a71946145ada8143d3fc07b89467c1d13b7a3fb43f0a7f2316c131fe334ae1407013"

RPROVIDES:${PN} += "qore-pgsql-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
