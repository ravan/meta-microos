SUMMARY = "Documentation for texlive-stickstoo"
DESCRIPTION = "This package includes the documentation for texlive-stickstoo"
LICENSE = "OFL-1.1"

PV = "2026.226.1.036svn77682"

RPM_NAME = "texlive-stickstoo-doc-2026.226.1.036svn77682-64.2.noarch.rpm"
RPM_HASH = "85e0be5f25704f94574675b664b6f586f6096a17804bda932e47ebbccdbb7e3a5557ca4eebb21529563e78944dfc903c5d9cfc013e8e4e3574172a1f6c7b756a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stickstoo-doc"

RDEPENDS:${PN} += ""

inherit rpm
