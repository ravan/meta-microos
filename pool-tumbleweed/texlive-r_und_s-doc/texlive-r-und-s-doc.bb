SUMMARY = "Documentation for texlive-r_und_s"
DESCRIPTION = "This package includes the documentation for texlive-r_und_s"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3isvn15878"

RPM_NAME = "texlive-r_und_s-doc-2026.226.1.3isvn15878-60.4.noarch.rpm"
RPM_HASH = "6ed65b01bc9b308452da30a0905d58d354457150c2b8f4ebc7fcf120736cb5305b16452b21adcb3c6be4fb2a2ca31efa2e28223d115b226afe2c2a234b0f7eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-r-und-s-doc"

RDEPENDS:${PN} += ""

inherit rpm
