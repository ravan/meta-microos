SUMMARY = "Non-ABI stable experimental API for the Qt5 SQL library"
DESCRIPTION = "This package provides private headers of libQt5Sql that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Sql-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "84a9ff8da6967f545a4676dfd16d2c1ba891d046e55a17f1b85bbe8e2b863a490bc220fa2e1258dd4926321a335769b13c4835840d8f06ecf5161c2e384abc58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Sql-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Sql-devel"

inherit rpm
