SUMMARY = "Documentation for texlive-univie-ling"
DESCRIPTION = "This package includes the documentation for texlive-univie-ling"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn77682"

RPM_NAME = "texlive-univie-ling-doc-2026.226.2.9svn77682-60.2.noarch.rpm"
RPM_HASH = "b83fec7a5ec64ceeee16fb00430425d2d0a8b92ace959205486294f3a3f15fb024db9251119bfa887c50ca61f80a2a44b83a20d0d21d69686b6159542e5c3745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-univie-ling-doc"

RDEPENDS:${PN} += ""

inherit rpm
