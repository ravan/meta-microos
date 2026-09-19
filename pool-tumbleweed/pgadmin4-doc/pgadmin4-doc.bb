SUMMARY = "Documentation for pgAdmin4"
DESCRIPTION = "pgAdmin 4 is a rewrite of the pgAdmin3 management tool for the \
PostgreSQL database. \
 \
This package contains the documentation for pgadmin4."
LICENSE = "PostgreSQL"

PV = "9.17"

RPM_NAME = "pgadmin4-doc-9.17-1.1.noarch.rpm"
RPM_HASH = "4b27f05f8123a29d9a073936fa05310847d7f64ee3cc12eaee713586bf0ce3289a46eaa71135a6e708cf5433cf053b54ab05dad9fb78e8c4cb1e496876379ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pgadmin4-doc"

RDEPENDS:${PN} += ""

inherit rpm
