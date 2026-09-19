SUMMARY = "Documentation for texlive-awami"
DESCRIPTION = "This package includes the documentation for texlive-awami"
LICENSE = "OFL-1.1"

PV = "2026.226.3.400svn76980"

RPM_NAME = "texlive-awami-doc-2026.226.3.400svn76980-60.2.noarch.rpm"
RPM_HASH = "1e7f00c38c09730d9401b1d618d4a2a677f3e9a7df5a3994209a05c545f8baf1f03c856262a9011d0e815278fbddf5eb0bc80942d52f92c1867a5f82f10fb1f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-awami-doc"

RDEPENDS:${PN} += ""

inherit rpm
