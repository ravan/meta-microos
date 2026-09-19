SUMMARY = "Documentation for texlive-poetry"
DESCRIPTION = "This package includes the documentation for texlive-poetry"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-poetry-doc-2026.226.2.2svn77682-59.2.noarch.rpm"
RPM_HASH = "a5301c109a9f9e6c42dddda82af607eb069ab1903bc1183378da3e7bf8fd9c93aeed7a2b778ada265919bc3243eb855429cc46a6f76d8816e04391fb8b3db036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poetry-doc"

RDEPENDS:${PN} += ""

inherit rpm
