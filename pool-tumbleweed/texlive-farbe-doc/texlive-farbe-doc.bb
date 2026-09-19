SUMMARY = "Documentation for texlive-farbe"
DESCRIPTION = "This package includes the documentation for texlive-farbe"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn75449"

RPM_NAME = "texlive-farbe-doc-2026.226.0.0.2.0svn75449-59.2.noarch.rpm"
RPM_HASH = "82e53fe3789e2ddfa071e7608ec9ad0e0b1154e3db9b89901f42c9f702ad0a13d5b6273b878db337b273facb08ffa54f7c50b802aaa5b2a258302127694e3ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-farbe-doc"

RDEPENDS:${PN} += ""

inherit rpm
