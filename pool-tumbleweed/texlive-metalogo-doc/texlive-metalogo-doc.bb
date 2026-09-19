SUMMARY = "Documentation for texlive-metalogo"
DESCRIPTION = "This package includes the documentation for texlive-metalogo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12svn77682"

RPM_NAME = "texlive-metalogo-doc-2026.226.0.0.12svn77682-61.2.noarch.rpm"
RPM_HASH = "cb894630c789f7038d554862f4f4955438ea15b37406dee3d65a55be629a9b2a0435c5d3eb81622037aa247da58ac38b6314810fae1bdc5502a90895a5bf6ca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metalogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
