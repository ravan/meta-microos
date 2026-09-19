SUMMARY = "Documentation for texlive-quizztex"
DESCRIPTION = "This package includes the documentation for texlive-quizztex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.6svn75977"

RPM_NAME = "texlive-quizztex-doc-2026.226.0.0.1.6svn75977-60.4.noarch.rpm"
RPM_HASH = "f3edae483a816a7cfdd2cada090c0d7f87a74889b28762d0da9da78d40eef6912b96ebbb5a957e9621cd5408dddba6ee01c6115a2c887199f14dcb3ae454248f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-quizztex-doc-fr \
texlive-quizztex-doc"

RDEPENDS:${PN} += ""

inherit rpm
