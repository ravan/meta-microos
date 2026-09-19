SUMMARY = "Documentation for texlive-rviewport"
DESCRIPTION = "This package includes the documentation for texlive-rviewport"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-rviewport-doc-2026.226.1.0svn76924-60.2.noarch.rpm"
RPM_HASH = "2715182c998041db2aa6fc0b476bcd35268c5dae082f494e8eb02d8b846af3d35572219ea723b11cf0aa85a73bd872efe05e062d5bfd373272d351eba26b6252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rviewport-doc"

RDEPENDS:${PN} += ""

inherit rpm
