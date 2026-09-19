SUMMARY = "Documentation for texlive-thaienum"
DESCRIPTION = "This package includes the documentation for texlive-thaienum"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2svn44140"

RPM_NAME = "texlive-thaienum-doc-2026.227.0.0.2svn44140-62.2.noarch.rpm"
RPM_HASH = "e60f9c7246d924f5a66900abee80621bc334cfc383dc80688c9d8068bf31747e03fb25f6465a2e1eed382d6a3562dd31fbb2e6e60a72bcdd77c851830b2f8218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thaienum-doc"

RDEPENDS:${PN} += ""

inherit rpm
