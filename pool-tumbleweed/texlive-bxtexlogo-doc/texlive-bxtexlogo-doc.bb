SUMMARY = "Documentation for texlive-bxtexlogo"
DESCRIPTION = "This package includes the documentation for texlive-bxtexlogo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn63231"

RPM_NAME = "texlive-bxtexlogo-doc-2026.226.0.0.6svn63231-59.2.noarch.rpm"
RPM_HASH = "01c53c608e62ba5bd8e8d309033e9f21075504355791321ffa9db0a3c526a5f3d7f736d747476c2773ccddf4347c8de87d22821c31025fdf68711c29164402fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxtexlogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
