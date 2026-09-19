SUMMARY = "Documentation for texlive-egpeirce"
DESCRIPTION = "This package includes the documentation for texlive-egpeirce"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn66924"

RPM_NAME = "texlive-egpeirce-doc-2026.226.1.0.0svn66924-61.4.noarch.rpm"
RPM_HASH = "f669015ac7b72531221eb731a5f68ac938bfa1efd22a583ab267ba5a6930927485dab5234006e2b1bc439d19a53d1a4677e7e4d135ce41e50aa3bd7c8ec734a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egpeirce-doc"

RDEPENDS:${PN} += ""

inherit rpm
