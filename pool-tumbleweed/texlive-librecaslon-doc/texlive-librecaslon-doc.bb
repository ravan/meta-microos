SUMMARY = "Documentation for texlive-librecaslon"
DESCRIPTION = "This package includes the documentation for texlive-librecaslon"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-librecaslon-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "c3aebad536f7b967e4d4efcda17edcaa5a1e828890dc48ac6b7e5e7c1c0f73952de6294806d687dd826004e2b0c35ee6a0cfd0928522eb0ea2f0ccdb765ae7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librecaslon-doc"

RDEPENDS:${PN} += ""

inherit rpm
