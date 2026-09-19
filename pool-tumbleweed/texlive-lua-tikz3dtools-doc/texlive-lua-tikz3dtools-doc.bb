SUMMARY = "Documentation for texlive-lua-tikz3dtools"
DESCRIPTION = "This package includes the documentation for texlive-lua-tikz3dtools"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.0svn77682"

RPM_NAME = "texlive-lua-tikz3dtools-doc-2026.226.2.3.0svn77682-59.2.noarch.rpm"
RPM_HASH = "a1df0a305d8518e7031c62f4d5b0c36bada8bed5a7f24d2a965aaad6460e8f6d826f1ef01e029a57a52c8eea4b295819a441fd7afef875bb7d686f929d1eda06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-tikz3dtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
