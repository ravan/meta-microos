SUMMARY = "Documentation for texlive-psfragx"
DESCRIPTION = "This package includes the documentation for texlive-psfragx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn26243"

RPM_NAME = "texlive-psfragx-doc-2026.226.1.1svn26243-59.2.noarch.rpm"
RPM_HASH = "b35d879a3f89bb6ed63299030016a9828625088ae813b78f36186d737f2ae05d60c5b306602d3067c42704548f923082ae04a506e92c1999ebdcb16c6d3a513a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psfragx-doc"

RDEPENDS:${PN} += ""

inherit rpm
