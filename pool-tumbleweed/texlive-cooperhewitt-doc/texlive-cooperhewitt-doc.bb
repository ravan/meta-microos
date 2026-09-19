SUMMARY = "Documentation for texlive-cooperhewitt"
DESCRIPTION = "This package includes the documentation for texlive-cooperhewitt"
LICENSE = "OFL-1.1"

PV = "2026.226.svn64967"

RPM_NAME = "texlive-cooperhewitt-doc-2026.226.svn64967-61.2.noarch.rpm"
RPM_HASH = "200029f9fdcc0511abac2e92684cff44bf48e40899430346bdc45112dd3b2c0f09a5d052b7786b5a2d2fee968f4d576cc113236fc2df632dfdcd69f2da676fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooperhewitt-doc"

RDEPENDS:${PN} += ""

inherit rpm
