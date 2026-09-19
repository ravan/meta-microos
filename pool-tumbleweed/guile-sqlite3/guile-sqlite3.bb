SUMMARY = "SQLite3 database access from Guile"
DESCRIPTION = "This package provides Guile bindings to the SQLite3 database system."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "guile-sqlite3-0.1.3-1.17.aarch64.rpm"
RPM_HASH = "9cdfc8a33d64134bc4108c9ab05a5be42d19abcccadf9b5f374ea806ed3b83a4212b9fd024feb508c20fc0adc10417547a7d85232cf7b883692785eefef67157"

RPROVIDES:${PN} += "guile-sqlite3"

RDEPENDS:${PN} += "guile \
sqlite3-devel"

inherit rpm
