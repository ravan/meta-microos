SUMMARY = "Documentation for texlive-minibox"
DESCRIPTION = "This package includes the documentation for texlive-minibox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn77682"

RPM_NAME = "texlive-minibox-doc-2026.226.0.0.2asvn77682-61.2.noarch.rpm"
RPM_HASH = "216690265aa416a060e2c10aacc8aa8581c622892492815984116bc41a378ae0e8632cf67d976bc09ea00475115a808b5520e4b1acf796f4b4ae08423c933c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minibox-doc"

RDEPENDS:${PN} += ""

inherit rpm
