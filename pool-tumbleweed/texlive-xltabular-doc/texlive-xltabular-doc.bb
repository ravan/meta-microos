SUMMARY = "Documentation for texlive-xltabular"
DESCRIPTION = "This package includes the documentation for texlive-xltabular"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0isvn77682"

RPM_NAME = "texlive-xltabular-doc-2026.226.2.0isvn77682-59.4.noarch.rpm"
RPM_HASH = "ed75cde4c86055f92936e71171c7be67b7d281bb9312ae4cdbdaa9c2321bc4c79bc1d80b7872e6250f8b1cfa7cb5497e2cbd68abfa72fb7231e5d6728a5611d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xltabular-doc"

RDEPENDS:${PN} += ""

inherit rpm
