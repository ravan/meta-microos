SUMMARY = "Documentation for texlive-physconst"
DESCRIPTION = "This package includes the documentation for texlive-physconst"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn58727"

RPM_NAME = "texlive-physconst-doc-2026.226.1.1.2svn58727-58.2.noarch.rpm"
RPM_HASH = "58bd09815275086246e406b82adf76e10847c2af36e3787a65ed4118b6f9bc8fab8f949914a2383cbf54f013bbdbe9d0f0302f4c64444e5ce4d134e3b9afafca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physconst-doc"

RDEPENDS:${PN} += ""

inherit rpm
