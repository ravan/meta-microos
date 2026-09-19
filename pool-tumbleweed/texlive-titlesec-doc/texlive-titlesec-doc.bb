SUMMARY = "Documentation for texlive-titlesec"
DESCRIPTION = "This package includes the documentation for texlive-titlesec"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.17svn77682"

RPM_NAME = "texlive-titlesec-doc-2026.226.2.17svn77682-59.2.noarch.rpm"
RPM_HASH = "9bd641f233c5a401291f08dbe96bdd77df2a97c469b74b8e8ce2768e704fa461e523a377e9ca828d131c1d85287220412019e1e7824b167f0e5ab2a6e55c6212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlesec-doc"

RDEPENDS:${PN} += ""

inherit rpm
