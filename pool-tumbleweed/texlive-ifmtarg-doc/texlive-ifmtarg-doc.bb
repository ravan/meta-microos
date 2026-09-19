SUMMARY = "Documentation for texlive-ifmtarg"
DESCRIPTION = "This package includes the documentation for texlive-ifmtarg"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn77682"

RPM_NAME = "texlive-ifmtarg-doc-2026.226.1.2bsvn77682-60.2.noarch.rpm"
RPM_HASH = "2f2f33c43d8f3e5141ce9dd2b5e4b61bdf81f2833da0763c038ad7bfd31c81e31dca03dfd696c476824ed8fa49f06bdb48dd504b5dbe469425be70fb3da73f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifmtarg-doc"

RDEPENDS:${PN} += ""

inherit rpm
