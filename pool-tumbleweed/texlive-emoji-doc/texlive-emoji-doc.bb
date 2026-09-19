SUMMARY = "Documentation for texlive-emoji"
DESCRIPTION = "This package includes the documentation for texlive-emoji"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.2svn77682"

RPM_NAME = "texlive-emoji-doc-2026.226.0.0.2.2svn77682-61.4.noarch.rpm"
RPM_HASH = "7d1c363f1e47f329132fc333de774eccffdde668eddedf6cc77677a3a88cdd8cc4d78d8df9b9bb10f44c8acc3a6a54aadd426b385c83460e3d5ff1c57fb9ec41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
