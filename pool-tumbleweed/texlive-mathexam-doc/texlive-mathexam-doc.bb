SUMMARY = "Documentation for texlive-mathexam"
DESCRIPTION = "This package includes the documentation for texlive-mathexam"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn15878"

RPM_NAME = "texlive-mathexam-doc-2026.226.1.00svn15878-59.2.noarch.rpm"
RPM_HASH = "f4fd8e8e174dd9361f0707f5149951c78a277e26b317935e402d05325899e1349e8abb60ff75400d8404d0e40519d1c04622df9a2b750b896b47508000ca1763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
