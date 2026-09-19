SUMMARY = "Documentation for texlive-newpax"
DESCRIPTION = "This package includes the documentation for texlive-newpax"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.57svn76924"

RPM_NAME = "texlive-newpax-doc-2026.226.0.0.57svn76924-61.2.noarch.rpm"
RPM_HASH = "14ee9c285c93fc98f37f204a23c8f3ebf888d3777b1766afd8083fd075d6d922cfedcc405bf9555480b11c69af77415c7148bb4eade1b0359b322e8c483b5310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newpax-doc"

RDEPENDS:${PN} += ""

inherit rpm
