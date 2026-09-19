SUMMARY = "Documentation for texlive-fullblck"
DESCRIPTION = "This package includes the documentation for texlive-fullblck"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn25434"

RPM_NAME = "texlive-fullblck-doc-2026.226.1.03svn25434-60.2.noarch.rpm"
RPM_HASH = "0e9e7d1130c7483251b14cb1657fc83002969fa899ae58661e4a97994ad3ccfaea0521e71cf93d8d0ebe4c1fc089f92b16d541d1f3eb63263c77e17edff4ad51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fullblck-doc"

RDEPENDS:${PN} += ""

inherit rpm
