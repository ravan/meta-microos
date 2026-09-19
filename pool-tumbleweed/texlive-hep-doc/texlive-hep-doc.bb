SUMMARY = "Documentation for texlive-hep"
DESCRIPTION = "This package includes the documentation for texlive-hep"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-hep-doc-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "e12bc2d5d849045b0b64e38290fa0066ad0de39b348a6d724e23ffe82a045333f5399cadbf814680ec460d80b9798ce4b97914ac6afcad598453004f298e86ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-doc"

RDEPENDS:${PN} += ""

inherit rpm
