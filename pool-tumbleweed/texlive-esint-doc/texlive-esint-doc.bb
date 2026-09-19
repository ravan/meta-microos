SUMMARY = "Documentation for texlive-esint"
DESCRIPTION = "This package includes the documentation for texlive-esint"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2dsvn77682"

RPM_NAME = "texlive-esint-doc-2026.226.1.2dsvn77682-61.4.noarch.rpm"
RPM_HASH = "eddcc3457f8e51f285a6be943b4240f774fb20ae3d68fc05ce64629cf3715535b778d13c9d1223c27b9a5b5a369fcc160cf905225d9d17d492037901d304b214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esint-doc"

RDEPENDS:${PN} += ""

inherit rpm
