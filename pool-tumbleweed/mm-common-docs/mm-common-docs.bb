SUMMARY = "Documentation for mm-common, includes example mm module skeleton"
DESCRIPTION = "Package contains short documentation for mm-common and example skeleton module, \
which could be used as a base for new mm module."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "mm-common-docs-1.0.8-1.2.noarch.rpm"
RPM_HASH = "9c84022572f6021dbd692e5486ff93e617ea715adbb880824d47551ded997688a99c6b7ff27cc16d561318112b2e11566c99da042811ee46b6fa8be97b5065ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mm-common-docs"

RDEPENDS:${PN} += "mm-common"

inherit rpm
