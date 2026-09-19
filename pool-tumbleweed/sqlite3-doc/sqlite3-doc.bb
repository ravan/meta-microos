SUMMARY = "Documentation for sqlite3"
DESCRIPTION = "Contains HTML documentation for SQLite: SQL Syntax, C/C++ API and \
other documentation found on sqlite.org. The files can be found in \
/usr/share/doc/packages/sqlite3-doc."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.53.2"

RPM_NAME = "sqlite3-doc-3.53.2-3.2.noarch.rpm"
RPM_HASH = "37bf36b6110e2c2b546be1160f86e80907039d8a6089c7ae04d432fb280d41c10fde06bbca936b57a7bc7948157e4fbe29ee40a04a12fc79abd643177b36b64f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlite3-doc"

RDEPENDS:${PN} += ""

inherit rpm
