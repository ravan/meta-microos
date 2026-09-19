SUMMARY = "Documentation for texlive-combofont"
DESCRIPTION = "This package includes the documentation for texlive-combofont"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn51348"

RPM_NAME = "texlive-combofont-doc-2026.226.0.0.3svn51348-60.2.noarch.rpm"
RPM_HASH = "593f53f214740fd4cf5eeb27ad91fc70efeaeed7c2f1de252261d1ed46bc57c52a038c71ded0c8b1be847aa129c88816468e7837a7898189704d34f92e63b500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combofont-doc"

RDEPENDS:${PN} += ""

inherit rpm
