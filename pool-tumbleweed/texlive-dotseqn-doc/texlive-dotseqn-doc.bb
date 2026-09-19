SUMMARY = "Documentation for texlive-dotseqn"
DESCRIPTION = "This package includes the documentation for texlive-dotseqn"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-dotseqn-doc-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "2793e8e98ed4d14a3bf45e3d522cc7d5ea737b4f41f6d65ce0faa0dc476ac3417e6056a3bbf88c6ca885fe7ac74cfeec08a2efb6a3ce3ac9b7a1a7e1f63ec653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dotseqn-doc"

RDEPENDS:${PN} += ""

inherit rpm
