SUMMARY = "Documentation for texlive-dejavu"
DESCRIPTION = "This package includes the documentation for texlive-dejavu"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.34svn77682"

RPM_NAME = "texlive-dejavu-doc-2026.226.2.34svn77682-59.2.noarch.rpm"
RPM_HASH = "84289a7554303d0351c9c61df8539a4b2120814eebbb9bcd763720c048b890477977b45dc3df1720edf78a789402fea7f773bb725af35b831817e971ed035876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dejavu-doc"

RDEPENDS:${PN} += ""

inherit rpm
