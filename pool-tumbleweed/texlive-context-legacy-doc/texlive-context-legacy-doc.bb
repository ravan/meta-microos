SUMMARY = "Documentation for texlive-context-legacy"
DESCRIPTION = "This package includes the documentation for texlive-context-legacy"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78010"

RPM_NAME = "texlive-context-legacy-doc-2026.226.svn78010-61.2.noarch.rpm"
RPM_HASH = "4dde1fddd842f5f27b5b21605d3d80096dd2d79e6eb07fdf3f4e280f151408b382039b6c1b18dc7ac358c97f1d375c2d40c1c52d4b30f72922cac70f0f996b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texexec.1 \
man-texmfstart.1 \
texlive-context-legacy-doc"

RDEPENDS:${PN} += ""

inherit rpm
