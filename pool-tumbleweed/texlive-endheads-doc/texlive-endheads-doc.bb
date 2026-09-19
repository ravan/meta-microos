SUMMARY = "Documentation for texlive-endheads"
DESCRIPTION = "This package includes the documentation for texlive-endheads"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn73959"

RPM_NAME = "texlive-endheads-doc-2026.226.1.7svn73959-61.4.noarch.rpm"
RPM_HASH = "224abf5b4e19ee7ac8599defa6ac642ed767d5bb70fabcd90e4e86df29242b764e48009271cbe0dd25f0be210acc7803e4583ea65b94539025ab74bb1686f919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endheads-doc"

RDEPENDS:${PN} += ""

inherit rpm
