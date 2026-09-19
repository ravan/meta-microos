SUMMARY = "Documentation for texlive-texaccents"
DESCRIPTION = "This package includes the documentation for texlive-texaccents"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0.1svn64447"

RPM_NAME = "texlive-texaccents-doc-2026.227.1.0.1svn64447-62.2.noarch.rpm"
RPM_HASH = "71677f87d724ce3f78bbc8a4f97334e210924f3c27b661a516fdc65e8b1737caa0d0834da04f8d8fa174ce77f489941f15fcdf9dacc2f77f2477aae3d2d5ed7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texaccents.1 \
texlive-texaccents-doc"

RDEPENDS:${PN} += ""

inherit rpm
