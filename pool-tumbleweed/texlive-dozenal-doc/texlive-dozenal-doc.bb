SUMMARY = "Documentation for texlive-dozenal"
DESCRIPTION = "This package includes the documentation for texlive-dozenal"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.2svn75722"

RPM_NAME = "texlive-dozenal-doc-2026.226.7.2svn75722-59.2.noarch.rpm"
RPM_HASH = "2f777502eeb73ffbf6b70b7bdf1ed73689bfeb08245b9fc4ecbe813b481a10c6e81100e9aa2ee9f6bbd2a94c43149dd236e8ae7de34c0c70d95a1c3d3b922bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dozenal-doc"

RDEPENDS:${PN} += ""

inherit rpm
