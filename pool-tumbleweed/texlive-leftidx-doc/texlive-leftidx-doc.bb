SUMMARY = "Documentation for texlive-leftidx"
DESCRIPTION = "This package includes the documentation for texlive-leftidx"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-leftidx-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "a580aff382ce82083a5273978606580ec42cda2e92df8a5fc5b5b6f744aca5e75df92aaf554cde921240dc1e3d96b071ae142e9f2ca03f2b749955d2ec1f88c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leftidx-doc"

RDEPENDS:${PN} += ""

inherit rpm
