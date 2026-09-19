SUMMARY = "API documentation for libyang"
DESCRIPTION = "This is the API documentation of libyang."
LICENSE = "BSD-3-Clause"

PV = "3.13.6"

RPM_NAME = "libyang-doc-3.13.6-3.3.noarch.rpm"
RPM_HASH = "f7a2fcef1855716d99d42a905bfde481e2e397da393e5dabca63c425d31f788952fda385e1da7891aa4f50c4dfa8e453e0b96a7813c281c5af65778efa35804c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libyang-doc"

RDEPENDS:${PN} += ""

inherit rpm
