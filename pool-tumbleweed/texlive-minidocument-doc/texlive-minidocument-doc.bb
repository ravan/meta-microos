SUMMARY = "Documentation for texlive-minidocument"
DESCRIPTION = "This package includes the documentation for texlive-minidocument"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn43752"

RPM_NAME = "texlive-minidocument-doc-2026.226.1.0svn43752-61.2.noarch.rpm"
RPM_HASH = "58e2aa191744ce3b09dc89799789a923a1c8ed01352d5827b643b75030799c95f523b913602847a65fd5b8ec7b5071df401693ed9e3385a9f4fdb22724105842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minidocument-doc"

RDEPENDS:${PN} += ""

inherit rpm
