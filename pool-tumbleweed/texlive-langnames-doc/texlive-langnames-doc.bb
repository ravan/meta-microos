SUMMARY = "Documentation for texlive-langnames"
DESCRIPTION = "This package includes the documentation for texlive-langnames"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.0svn69101"

RPM_NAME = "texlive-langnames-doc-2026.226.3.0.0svn69101-63.2.noarch.rpm"
RPM_HASH = "169208bf8fb5383b21ee1f116a68ed5418330df317e50702bf7ab5393bcf0ea70f125aced51db402dc70da3286cfa4214e684fab51cc8f2ac5feeb3f5d0764df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langnames-doc"

RDEPENDS:${PN} += ""

inherit rpm
