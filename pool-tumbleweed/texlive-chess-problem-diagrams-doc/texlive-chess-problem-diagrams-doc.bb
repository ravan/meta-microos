SUMMARY = "Documentation for texlive-chess-problem-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-chess-problem-diagrams"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.23svn78101"

RPM_NAME = "texlive-chess-problem-diagrams-doc-2026.226.1.23svn78101-60.2.noarch.rpm"
RPM_HASH = "96ffbfabc8fd90d2cab89b9d529698e3aafae85da64d26b96bf11ac28243bc406f9d6e6d0f28584bfaacb2ad8e98637e4af3c1642d6acbf8c4101b85b7f93c7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chess-problem-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
