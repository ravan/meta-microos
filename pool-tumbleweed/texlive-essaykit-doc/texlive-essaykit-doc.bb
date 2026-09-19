SUMMARY = "Documentation for texlive-essaykit"
DESCRIPTION = "This package includes the documentation for texlive-essaykit"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77253"

RPM_NAME = "texlive-essaykit-doc-2026.226.2.0svn77253-59.2.noarch.rpm"
RPM_HASH = "952a5885e64301815ad4078c5fcdf2ab880d77cb394870e92dd00034435295f62866aac52b86a6b87de2faa4d019097c38d8b1eb086dbb2a683f03d6cf749325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-essaykit-doc"

RDEPENDS:${PN} += ""

inherit rpm
