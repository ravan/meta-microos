SUMMARY = "Documentation for texlive-mtgreek"
DESCRIPTION = "This package includes the documentation for texlive-mtgreek"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1+svn17967"

RPM_NAME = "texlive-mtgreek-doc-2026.226.1.1+svn17967-61.2.noarch.rpm"
RPM_HASH = "8b807f95d366641fc29f70ad2074bbbd966e2f9152e96b0d9ecd22ba370aa28bce6cf77aab4da444b2ee97de45b1a402b795e68241c85080fa175db2bb31169a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mtgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
