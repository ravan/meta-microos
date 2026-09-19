SUMMARY = "Documentation for texlive-curriculum-vitae"
DESCRIPTION = "This package includes the documentation for texlive-curriculum-vitae"
LICENSE = "Apache-1.0"

PV = "2026.226.2.0svn75698"

RPM_NAME = "texlive-curriculum-vitae-doc-2026.226.2.0svn75698-61.2.noarch.rpm"
RPM_HASH = "2424b0ce9c034e0ff4b708eea1823aa19c4dbb7c28a41dea46723a9e5073f4bc17ab59aaac94be224439cb6026499d79efcb56734c9dd1705cc18fc532a93c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-curriculum-vitae-doc"

RDEPENDS:${PN} += ""

inherit rpm
