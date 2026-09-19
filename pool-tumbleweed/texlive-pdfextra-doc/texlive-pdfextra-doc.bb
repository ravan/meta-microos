SUMMARY = "Documentation for texlive-pdfextra"
DESCRIPTION = "This package includes the documentation for texlive-pdfextra"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn65184"

RPM_NAME = "texlive-pdfextra-doc-2026.226.0.0.3svn65184-58.2.noarch.rpm"
RPM_HASH = "78472ae0db1034ea1209847b726373c2a7f3b1ff8f8aea31027954844ac12b70f1ae90e0665a6fa8b8700db04795165d5ffc4ce6300f7e7866e63ab9444011b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfextra-doc"

RDEPENDS:${PN} += ""

inherit rpm
