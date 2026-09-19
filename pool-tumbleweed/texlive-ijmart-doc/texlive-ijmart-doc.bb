SUMMARY = "Documentation for texlive-ijmart"
DESCRIPTION = "This package includes the documentation for texlive-ijmart"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn30958"

RPM_NAME = "texlive-ijmart-doc-2026.226.1.7svn30958-60.2.noarch.rpm"
RPM_HASH = "cce589fca3d7f84eebe2cb7d9b70cf62ff0d989597697fc420ec5bc4515da4882893b91b52eb7de2fe3ac9ec5a1dbd74de88bd37bbba1110b8e107adff94ec59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijmart-doc"

RDEPENDS:${PN} += ""

inherit rpm
