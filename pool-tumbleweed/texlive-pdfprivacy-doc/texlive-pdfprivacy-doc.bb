SUMMARY = "Documentation for texlive-pdfprivacy"
DESCRIPTION = "This package includes the documentation for texlive-pdfprivacy"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn45985"

RPM_NAME = "texlive-pdfprivacy-doc-2026.226.1.0svn45985-58.2.noarch.rpm"
RPM_HASH = "4a44c558d719b66decba8970d25b4ad208fe0fa0f14de5c7bbdefd6256b6ae9ce0396debe47bf2e1615c961fc5741f45b29c29e9637f534dc2b11f2bb2392108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfprivacy-doc"

RDEPENDS:${PN} += ""

inherit rpm
