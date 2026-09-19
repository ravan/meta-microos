SUMMARY = "Documentation for texlive-fascicules"
DESCRIPTION = "This package includes the documentation for texlive-fascicules"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn54080"

RPM_NAME = "texlive-fascicules-doc-2026.226.1svn54080-59.2.noarch.rpm"
RPM_HASH = "38fb07d2d51e132fcd1b0cd96c4400fc42948a4fcb959a881b6503bcf89c3b19752d3d0c3f360bf0ca863018fd4974df84cbc974f637ec6aed3a0c10242277fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fascicules-doc-fr \
texlive-fascicules-doc"

RDEPENDS:${PN} += ""

inherit rpm
