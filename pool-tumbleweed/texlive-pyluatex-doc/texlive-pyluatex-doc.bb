SUMMARY = "Documentation for texlive-pyluatex"
DESCRIPTION = "This package includes the documentation for texlive-pyluatex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.3svn77682"

RPM_NAME = "texlive-pyluatex-doc-2026.226.0.0.6.3svn77682-60.4.noarch.rpm"
RPM_HASH = "17ad6f3825457743009919537463900fd5bb11c57bdef92a922fe687316a7ddba5d7e002075f34fee2f667201d2fb7085418a1723f8b98d86bb0fa59282a1861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pyluatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
