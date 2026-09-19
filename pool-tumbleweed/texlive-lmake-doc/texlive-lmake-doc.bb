SUMMARY = "Documentation for texlive-lmake"
DESCRIPTION = "This package includes the documentation for texlive-lmake"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25552"

RPM_NAME = "texlive-lmake-doc-2026.226.1.0svn25552-61.2.noarch.rpm"
RPM_HASH = "a6003e58c741e16a0faa82b6f417ed7e9a78557d84958f8f4a32e84d6adc1d150e50a866a3636120c7cfe87f4a039a9962cd7e34ffafbace32d5c994ea16a475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lmake-doc"

RDEPENDS:${PN} += ""

inherit rpm
