SUMMARY = "Documentation for texlive-chifoot"
DESCRIPTION = "This package includes the documentation for texlive-chifoot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn57312"

RPM_NAME = "texlive-chifoot-doc-2026.226.1.0svn57312-60.2.noarch.rpm"
RPM_HASH = "19b0b8e4f3af9a58caf698edf0e1518b4a5055ffd48fead5d677144563d03e15b9c64cdd7370ea1ad4d7a2710c5f278ee70c7d8f670c8e1c6452848f3554cb36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chifoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
