SUMMARY = "Documentation for texlive-biblatex-nature"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-nature"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3dsvn57262"

RPM_NAME = "texlive-biblatex-nature-doc-2026.226.1.3dsvn57262-61.2.noarch.rpm"
RPM_HASH = "bb2d6fb51849d7e407d5a4c3b3e20d19a77fdd832f607924bed0d7c7b0870c37eaf4c0417feede7867a06d1aa950d7881a2268e4717bac3bc9eb61f0e367f6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-nature-doc"

RDEPENDS:${PN} += ""

inherit rpm
