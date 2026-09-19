SUMMARY = "Documentation for the libmwaw API"
DESCRIPTION = "This package contains documentation for the libmwaw API."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-devel-doc-0.3.21-3.10.noarch.rpm"
RPM_HASH = "74f0afeeeaeaaf26d86d482f448979ad8138fbfd8da1e49644b8078aabf8a62f2346c16fd613e2c22c2adcea1ddd385ed0f55ffb8f908989643ca1bb0be798eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmwaw-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
