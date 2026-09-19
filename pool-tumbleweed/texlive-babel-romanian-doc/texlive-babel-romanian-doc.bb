SUMMARY = "Documentation for texlive-babel-romanian"
DESCRIPTION = "This package includes the documentation for texlive-babel-romanian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2msvn77682"

RPM_NAME = "texlive-babel-romanian-doc-2026.226.1.2msvn77682-60.2.noarch.rpm"
RPM_HASH = "78e40e4d078f6cff59634cf2f85b61e5048da0c59b3d0265ceca0e136183d81d9804ba0882611f7003a58fbfb79fccfd0cdba2f641b7ce988a0809e4a3194085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-romanian-doc"

RDEPENDS:${PN} += ""

inherit rpm
